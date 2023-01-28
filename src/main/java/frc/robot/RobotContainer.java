// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Collector;
import frc.robot.subsystems.Drivetrain;
import frc.robot.subsystems.Indexer;
import frc.robot.subsystems.Shooter;
//import frc.RobotContainer.Compress;
//import frc.robot.subsystems.Compress;
//import frc.robot.commands.Compressor.Compress_ACTIVE;



public class RobotContainer {

  public static XboxController operatorController;

  public static XboxController driverController;


//defining subsystems
public static Collector collectorSystem = new Collector();

public static Drivetrain drivetrain = new Drivetrain();

public static Indexer indexerSystem = new Indexer();
  
public static Shooter shooterSystem = new Shooter();

public static Compressor compressorSystem = new Compressor(null);



  // The robot's subsystems and commands are defined here...
 
  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings();
  }

  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {}

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return null;
  }

public static Object getY() {
    return null;
}

public static Object getButton(int i) {
    return null;
}

public static void CurveDrive(Object y, Object y2, Object button) {
}

public static Object getX() {
    return null;
}

public static void ArcadeDrive(Object y, Object x) {
}

public static void activation(boolean dump) {
}

public static void retraction() {
}

public class compressorSystem {
}

public static void compressorSystem() {
}

}
