package frc.robot.commands.Compressor;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;

public class compressorACTIVATE extends CommandBase {
    
    public compressorACTIVATE() {
        addRequirements(RobotContainer.compressorSystem);
    }

    private void addRequirements(Compressor compressorSystem) {
    }

    @Override
    public void initialize() {}

    @Override
    public void execute() {
        RobotContainer.compressorSystem();
    }

    @Override
    public void end(boolean interrupted) {}

    @Override
    public boolean isFinished() {
        return false;
    }
}
