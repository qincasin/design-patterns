package factory;

public class PythonCourseFactory implements CourseFactory {
    public IVideo createVideo() {
        return new PythonVideo();
    }

    public INote createNote() {
        return new PythonNote();
    }
}
