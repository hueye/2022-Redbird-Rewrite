package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Indexer extends SubsystemBase {
    
    WPI_TalonSRX indexerMotor;
    WPI_TalonSRX feederMotor;

    MotorControllerGroup motors;

    public Indexer() {
        indexerMotor = new WPI_TalonSRX(Constants.IN_MOTOR_ID);
        feederMotor = new WPI_TalonSRX(Constants.IN_MOTOR_FEED);

        indexerMotor.setNeutralMode(NeutralMode.Brake);
        feederMotor.setNeutralMode(NeutralMode.Brake);

        indexerMotor.setInverted(true);

        motors = new MotorControllerGroup(indexerMotor, feederMotor);
    }

    public void indexing() {
        motors.set(Constants.IN_MOTOR_SPEED);
    }

    public void terminating() {
        motors.set(0);
    }

    @Override
    public void periodic() {}
}
