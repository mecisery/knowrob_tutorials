package knowrob_tutorial_msgs;

public interface ObjectDetection extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "knowrob_tutorial_msgs/ObjectDetection";
  static final java.lang.String _DEFINITION = "string type\ngeometry_msgs/PoseStamped pose\n";
  java.lang.String getType();
  void setType(java.lang.String value);
  geometry_msgs.PoseStamped getPose();
  void setPose(geometry_msgs.PoseStamped value);
}
