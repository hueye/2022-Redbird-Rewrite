package frc.robot.commands.Shooter;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.RobotContainer;

public class shooterIDLE extends CommandBase {
    
    public shooterIDLE() {
        addRequirements(RobotContainer.shooterSystem);
    }

    @Override
    public void initialize() {}

    @Override
    public void execute() {
        RobotContainer.shooterSystem.Shoot(Constants.SHidleRPM, false);
    }

    @Override
    public void end(boolean interrupted) {}

    @Override
    public boolean isFinished() {
        return false;
    }
}
