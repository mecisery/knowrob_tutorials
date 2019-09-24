package knowrob_tutorial_msgs;

public interface DetectObjectResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "knowrob_tutorial_msgs/DetectObjectResponse";
  static final java.lang.String _DEFINITION = "knowrob_tutorial_msgs/ObjectDetection obj  # type and pose of detected object";
  knowrob_tutorial_msgs.ObjectDetection getObj();
  void setObj(knowrob_tutorial_msgs.ObjectDetection value);
}
