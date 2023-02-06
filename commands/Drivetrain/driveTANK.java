package frc.robot.commands.Drivetrain;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;

//declaring a new tank drive
public class driveTANK extends CommandBase {
    
    public driveTANK() {
        addRequirements(RobotContainer.drivetrain);
    }

//starting the command
    @Override
    public void initialize() {}

//executing
    @Override
    public void execute() {
        RobotContainer.ArcadeDrive(RobotContainer.getY(), RobotContainer.getX());
    }
//called when the command ends/is interrupted
    @Override
    public void end(boolean interrupted) {}

//returns true when the command has to end
    @Override
    public boolean isFinished() {
        return false;
    }
}