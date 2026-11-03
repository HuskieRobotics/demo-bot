package frc.robot.subsystems.arm;

public class ArmConstants {
    private static final String CONSTRUCTOR_EXCEPTION = "constant class";

    private ArmConstants() {
        throw new IllegalStateException(CONSTRUCTOR_EXCEPTION);
    }

    public static final String SUBSYSTEM_NAME = "Arm";

    public static final double COMPLIANT_LEFT_KP = 0.0;
    public static final double COMPLIANT_LEFT_KI = 0.0;
    public static final double COMPLIANT_LEFT_KD = 0.0;
    public static final double COMPLIANT_LEFT_KS = 0.0;
    public static final double COMPLIANT_LEFT_KV = 0.0;

    public static final double COMPLIANT_RIGHT_KP = 0.0;
    public static final double COMPLIANT_RIGHT_KI = 0.0;
    public static final double COMPLIANT_RIGHT_KD = 0.0;
    public static final double COMPLIANT_RIGHT_KS = 0.0;
    public static final double COMPLIANT_RIGHT_KV = 0.0;

    public static final double ROLLER_KP = 0.0;
    public static final double ROLLER_KI = 0.0;
    public static final double ROLLER_KD = 0.0;
    public static final double ROLLER_KS = 0.0;
    public static final double ROLLER_KV = 0.0;
    
    public static final double WRIST_KP = 0.0;
    public static final double WRIST_KI = 0.0;
    public static final double WRIST_KD = 0.0;
    public static final double WRIST_KS = 0.0;
    public static final double WRIST_KG = 0.0;

    public static final double PIVOT_KP = 0.0;
    public static final double PIVOT_KI = 0.0;
    public static final double PIVOT_KD = 0.0;
    public static final double PIVOT_KS = 0.0;
    public static final double PIVOT_KG = 0.0;
    public static final double PIVOT_KA = 0.0;
    public static final double PIVOT_KV_EXPO = 0.0;
    public static final double PIVOT_KA_EXPO = 0.0;
}
