package frc.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.SampleRobot;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class Robot extends SampleRobot {

  WPI_TalonSRX leftDrive = new WPI_TalonSRX(19);
  WPI_TalonSRX rightDrive = new WPI_TalonSRX(20);
  WPI_TalonSRX leftDriveBack = new WPI_TalonSRX(17);
  WPI_TalonSRX rightDriveBack = new WPI_TalonSRX(18);

  SpeedControllerGroup leftDriveGroup = new SpeedControllerGroup(leftDrive, leftDriveBack);
  SpeedControllerGroup rightDriveGroup = new SpeedControllerGroup(rightDrive, rightDriveBack);

  private final DifferentialDrive drive = new DifferentialDrive(leftDrive, rightDrive);
  private final Joystick joystick = new Joystick(0);

  public Robot() {

  }

  @Override
  public void robotInit() {

  }

  
  @Override
  public void autonomous() {

  }

  
  @Override
  public void operatorControl() {
    while (isOperatorControl() && isEnabled()) {
      
      drive.arcadeDrive(-joystick.getY(), joystick.getX());

      
      Timer.delay(0.005);
    }
  }

  @Override
  public void test() {

  }
}
