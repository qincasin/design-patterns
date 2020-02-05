package factory;

public class JavaCourseFactory implements CourseFactory {
    public IVideo createVideo() {
        return new JavaVideo();
    }

    public INote createNote() {
        return new JavaNote();
    }
}
