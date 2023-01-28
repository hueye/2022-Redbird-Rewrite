package frc.robot.subsystems;

import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Compressor extends SubsystemBase {
    
    Compressor compressor;

    public Compressor(int cmid, PneumaticsModuleType revph) {
    }

    public void compressing() {
        compressor = new Compressor(Constants.CMID, PneumaticsModuleType.REVPH);
    }

    public void activation() {
        compressor.enableAnalog(Constants.CMrangeMin, Constants.CMrangeMax);
    }

    private void enableAnalog(double cmrangemin, double cmrangemax) {
    }

    @Override
    public void periodic() {}

}
