package frc.robot.subsystems.arm;

import org.littletonrobotics.junction.AutoLog;

public interface ArmIO {
    @AutoLog
    public static class ArmIOInputs {
        // sensors
        boolean leftSensorBlocked = false;
        boolean rightSensorBlocked = false;
        boolean centralSensorBlocked = false;
        boolean bottomSensorBlocked = false;

        // compliant left
        boolean compliantLeftConnected = false;
        double compliantLeftStatorCurrentAmps = 0.0;
        double compliantLeftSupplyCurrentAmps = 0.0;
        double compliantLeftTorqueCurrent = 0.0;
        double compliantLeftVelocityRPS = 0.0;
        double compliantLeftReferenceVelocityRPS = 0.0;
        double compliantLeftClosedLoopReferenceVelocityRPS = 0.0;
        double compliantLeftClosedLoopErrorVelocityRPS = 0.0;
        double compliantLeftTemperatureCelsius = 0.0;
        
        // compliant right
        boolean compliantRightConnected = false;
        double compliantRightStatorCurrentAmps = 0.0;
        double compliantRightSupplyCurrentAmps = 0.0;
        double compliantRightTorqueCurrent = 0.0;
        double compliantRightVelocityRPS = 0.0;
        double compliantRightReferenceVelocityRPS = 0.0;
        double compliantRightClosedLoopReferenceVelocityRPS = 0.0;
        double compliantRightClosedLoopErrorVelocityRPS = 0.0;
        double compliantRightTemperatureCelsius = 0.0;

        // roller motor
        boolean rollerConnected = false;
        double rollerStatorCurrentAmps = 0.0;
        double rollerSupplyCurrentAmps = 0.0;
        double rollerTorqueCurrent = 0.0;
        double rollerCentralVelocityRPS = 0.0;
        double rollerReferenceVelocityRPS = 0.0;
        double rollerClosedLoopReferenceVelocityRPS = 0.0;
        double rollerClosedLoopErrorVelocityRPS = 0.0;
        double rollerTemperatureCelsius = 0.0;

        // wrist motor
        boolean wristConnected = false;
        double wristVoltage = 0.0;
        double wristPositionRot = 0.0;
        double wristReferencePositionRot = 0.0;
        double wristClosedLoopReferencePositionRot = 0.0;
        double wristClosedLoopErrorPositionRot =  0.0;
        double wristTemperatureCelsius = 0.0;

        // pivot motor
        boolean pivotConnected = false;
        double pivotVoltage = 0.0;
        double pivotPositionRot = 0.0;
        double pivotReferencePositionRot = 0.0;
        double pivotClosedLoopReferencePositionRot = 0.0;
        double pivotClosedLoopErrorPositionRot = 0.0;
        double pivotTemperatureCelsius = 0.0;
    }
    public default void setCompliantLeftVelocity(double velocity) {}
    public default void setCompliantLeftTorqueCurrent() {}

    public default void setCompliantRightVelocity(double velocity) {}
    public default void setCompliantRightTorqueCurrent() {}

    public default void setWristMotorVelocity(double velocity) {}
    public default void setWristMotorTorqueCurrent() {}

    public default void setRollerPosition(double position) {}
    public default void setRollerVoltage(double volts) {}

    public default void setPivotVoltage(double volts) {}
}
