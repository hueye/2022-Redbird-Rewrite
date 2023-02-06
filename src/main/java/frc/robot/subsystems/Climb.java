package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Climb extends SubsystemBase {
    
    static WPI_TalonFX leftArmMotor;
    static WPI_TalonFX rightArmMotor;
    static DoubleSolenoid climbPiston;

    public Climb() {
        leftArmMotor = new WPI_TalonFX(Constants.CBlftID);
        rightArmMotor = new WPI_TalonFX(Constants.CBrghtID);
        climbPiston = new DoubleSolenoid(Constants.CBpistonID, PneumaticsModuleType.REVPH, Constants.CBpistonForward, Constants.CBpistonReverse);

        rightArmMotor.setInverted(true);
        rightArmMotor.follow(leftArmMotor);

        leftArmMotor.setNeutralMode(NeutralMode.Brake);
        rightArmMotor.setNeutralMode(NeutralMode.Brake);
    }

    public static void weAreClimbing() {
        climbPiston.set(Value.kForward);

        leftArmMotor.set(Constants.CBlftExtended);
        rightArmMotor.set(Constants.CBrghtExtended);
    }

    public static void noClimbing() {
        climbPiston.set(Value.kReverse);

        leftArmMotor.set(Constants.CBlftRetracted);
        rightArmMotor.set(Constants.CBrghtRetracted);
    }


}
