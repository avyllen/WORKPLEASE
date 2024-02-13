// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.Constants.OperatorConstants;
import frc.robot.commands.Autos;
import frc.robot.commands.FeederCommands.FeederSpeed;
import frc.robot.commands.FeederCommands.FeederPosition.FeederAngle50;
import frc.robot.subsystems.ShooterSubsystem;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandJoystick;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import edu.wpi.first.wpilibj2.command.button.Trigger;
import frc.robot.commands.IntakeCommands.DefaultIntake;
import frc.robot.commands.IntakeCommands.IntakeSpeeds.IntakeSpeed87;
import frc.robot.commands.PivotCommands.PivotPositions.Pivot50;
import frc.robot.commands.PivotCommands.PivotPositions.Pivot70;
import frc.robot.commands.PivotCommands.PivotPositions.Pivot80;


import frc.robot.commands.Shootercommands.ShooterPosition.ShooterPosition0;
import frc.robot.commands.Shootercommands.ShooterPosition.ShooterPosition50;
import frc.robot.commands.Shootercommands.ShooterPosition.ShooterPositionN70;
import frc.robot.commands.Shootercommands.ShooterPosition.ShooterReset;
import frc.robot.commands.Shootercommands.ShooterSpeeds.ShooterSpeed0;
import frc.robot.commands.Shootercommands.ShooterSpeeds.ShooterSpeed50;
import frc.robot.commands.Shootercommands.ShooterSpeeds.ShooterSpeed85;
import frc.robot.commands.Shootercommands.ShooterSpeeds.ShooterSpeed90;
import frc.robot.subsystems.FeederSubsystem;
import frc.robot.subsystems.IntakeSubsystem;
import frc.robot.subsystems.PivotSubsystem;
import edu.wpi.first.wpilibj.Joystick;



/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and trigger mappings) should be declared here.
 */
public class RobotContainer { 
  {
  // The robot's subsystems and commands are defined here...
  


  // Replace with CommandPS4Controller or CommandJoystick if needed
      new CommandJoystick(OperatorConstants.kDriverControllerPort); }
        // The robot's subsystems and commands are defined here...
  private final IntakeSubsystem intakeSubsystem = new IntakeSubsystem();

    
  private final ShooterSubsystem shooterSubsystem = new ShooterSubsystem();


  private final PivotSubsystem pivotSubsystem = new PivotSubsystem();

  private final FeederSubsystem feederSubsystem = new FeederSubsystem();

  // Replace with CommandPS4Controller or CommandJoystick if needed
  private final DefaultIntake DrivewithJoystickCommand = new DefaultIntake(intakeSubsystem);


public static XboxController xboxController = new XboxController(1);
public static Joystick joystick = new Joystick(0);
public static Object Joystick;
public static int desiredPOV = xboxController.getPOV();




  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the trigger bindings
    configureBindings();
    shooterSubsystem.setDefaultCommand(new ShooterSpeed0(shooterSubsystem));
    intakeSubsystem.setDefaultCommand(DrivewithJoystickCommand);
    new Trigger(intakeSubsystem::exampleCondition)
    .onTrue(new DefaultIntake(intakeSubsystem));
  }

  /**
   * Use this method to define your trigger->command mappings. Triggers can be created via the
   * {@link Trigger#Trigger(java.util.function.BooleanSupplier)} constructor with an arbitrary
   * predicate, or via the named factories in {@link
   * edu.wpi.first.wpilibj2.command.button.CommandGenericHID}'s subclasses for {@link
   * CommandXboxController Xbox}/{@link edu.wpi.first.wpilibj2.command.button.CommandPS4Controller
   * PS4} controllers or {@link edu.wpi.first.wpilibj2.command.button.CommandJoystick Flight
   * joysticks}.
   */
  private void configureBindings() {

    // CONTROLS SHOOTER SPEED :>
   new JoystickButton(xboxController,1).toggleOnTrue(new ShooterSpeed0(shooterSubsystem));
   new JoystickButton(xboxController,2).toggleOnTrue(new ShooterSpeed50(shooterSubsystem));
    new JoystickButton(xboxController,3).toggleOnTrue(new ShooterSpeed85(shooterSubsystem));
    new JoystickButton(xboxController,4).toggleOnTrue(new ShooterSpeed90(shooterSubsystem));

  new JoystickButton(joystick,8).onTrue(new ShooterPosition0(shooterSubsystem));
  new JoystickButton(joystick,10).onTrue(new ShooterPosition50(shooterSubsystem));
    new JoystickButton(joystick,12).onTrue(new ShooterPositionN70(shooterSubsystem));
    new JoystickButton(joystick,7).onTrue(new ShooterReset(shooterSubsystem));


// CONTROLS INTAKE :>
new JoystickButton(joystick, 1).whileTrue(new IntakeSpeed87(intakeSubsystem));
new JoystickButton(joystick,2).whileTrue(new FeederSpeed(feederSubsystem));
new JoystickButton(joystick,4).whileTrue(new FeederAngle50());
//CONTROLS PIVOT :>
if (desiredPOV == 0) {
new Pivot50(pivotSubsystem);
} 
else if (desiredPOV == 90) {
new Pivot70(pivotSubsystem);
} 
else if (desiredPOV == 180) {
  new Pivot80(pivotSubsystem);
}
  }
 


  

  

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An example command will be run in autonomous
    return Autos.exampleAuto(intakeSubsystem);
    }
  }
