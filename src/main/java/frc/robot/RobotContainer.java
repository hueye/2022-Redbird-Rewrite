// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import edu.wpi.first.wpilibj2.command.button.POVButton;
import frc.robot.commands.Climb.climbACTIVE;
import frc.robot.commands.Collector.collectorACTIVATE;
import frc.robot.commands.Drivetrain.driveARCADE;
import frc.robot.commands.Drivetrain.driveBRAKE;
import frc.robot.commands.Indexer.indexerACTIVATE;
import frc.robot.commands.Shooter.shooterACTIVE;
import frc.robot.commands.Shooter.shooterIDLE;
import frc.robot.subsystems.Climb;
import frc.robot.subsystems.Collector;
import frc.robot.subsystems.Drivetrain;
import frc.robot.subsystems.Indexer;
import frc.robot.subsystems.ShooterWithHood;

public class RobotContainer {


  //controllers and buttons
  public static XboxController operatorController;

  public static XboxController driverController;

  public JoystickButton brakeButton;

  public JoystickButton collectionCollect;

  public JoystickButton collectionDump;

  public JoystickButton indexTrigger;

  public JoystickButton climbGoClimbing;

  public JoystickButton climbDoNotClimb;

  public POVButton upButton;

  public POVButton rightButton;

  public POVButton downButton;

  public POVButton leftButton;
  
//defining subsystems
public static Drivetrain drivetrain = new Drivetrain();

public static Collector collectorSystem = new Collector();

public static Indexer indexerSystem = new Indexer();
  
public static ShooterWithHood shooterSystem = new ShooterWithHood();

public static Compressor compressorSystem = new Compressor(null);

public static Climb climbSystem = new Climb();


  // The robot's subsystems and commands are defined here...

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings();

  //controllers and buttons
    driverController = new XboxController(Constants.CTRL_FOR_DRIVER);

    operatorController = new XboxController(Constants.CTRL_FOR_OPERATOR);

  //default commands
    drivetrain.setDefaultCommand(new driveARCADE());

    shooterSystem.setDefaultCommand(new shooterIDLE());

    //compressorSystem.setDefaultCommand(new compressACTIVATE());

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
  
  /* public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return null;
  } */

public static void CurveDrive(Object y, Object y2) {}

public static void ArcadeDrive(Object y, Object x) {}

public static void TankDrive(Object y, Object x) {}


//button binding
public void buttonBinds() {
  brakeButton = new JoystickButton(driverController, XboxController.Button.kB.value);
  brakeButton.whileHeld(new driveBRAKE());

  climbGoClimbing = new JoystickButton(operatorController, XboxController.Button.kX.value);
  climbGoClimbing.whileHeld(new climbACTIVE(), true);

  collectionCollect = new JoystickButton(operatorController, XboxController.Button.kA.value);
  collectionCollect.whileHeld(new collectorACTIVATE(false), true);

  collectionDump = new JoystickButton(operatorController, XboxController.Button.kB.value);
  collectionDump.whileHeld(new collectorACTIVATE(true), true);

  indexTrigger = new JoystickButton(operatorController, XboxController.Axis.kRightTrigger.value);
  indexTrigger.whileHeld(new indexerACTIVATE(), true);

  upButton = new POVButton(operatorController, 0);
  upButton.whileHeld(new shooterACTIVE(), true);

  rightButton = new POVButton(operatorController, 90);
  rightButton.whileHeld(new shooterACTIVE(), true);

  downButton = new POVButton(operatorController, 180);
  downButton.whileHeld(new shooterACTIVE(), true);

  leftButton = new POVButton(operatorController, 270);
  leftButton.whileHeld(new shooterACTIVE(), true);
}

public static void Active() {
}

}