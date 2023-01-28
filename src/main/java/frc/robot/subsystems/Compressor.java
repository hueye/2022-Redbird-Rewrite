package frc.robot.subsystems;

import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Compressor extends SubsystemBase {
    
    static Compressor theeCompressor;


    public Compressor(int cmid, PneumaticsModuleType revph) {
    }

    public static void Compress() {
        theeCompressor = new Compressor(Constants.CMID, PneumaticsModuleType.REVPH);
    }
    
    public void Active() {
        theeCompressor.enableAnalog(Constants.CMrangeMin, Constants.CMrangeMax);
    }


    private void enableAnalog(double CMrangeMin, double CMrangeMax) {
    }

    @Override
    public void periodic() {}

}
