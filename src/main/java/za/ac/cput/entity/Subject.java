package src.main.java.za.ac.cput.entity;

/* Subject.java
Entity for the Subject
Author: Chante Lewis (216118395)
Date: 07 April 2022
 */

public class Subject {

    private String subject_id;
    private String subject_name;

    private Subject(){}

    private Subject(SubjectBuilder builder){
        this.subject_id = builder.subject_id;
        this.subject_name = builder.subject_name;
    }

    public String getSubject_id() {
        return subject_id;
    }

    public String getSubject_name() {
        return subject_name;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subject_id=" + subject_id +
                ", subject_name='" + subject_name + '\'' +
                '}';
    }

    public static class SubjectBuilder{
        private String subject_id;
        private String subject_name;

        public SubjectBuilder setSubject_id(String subject_id) {
            this.subject_id = subject_id;
            return this;
        }

        public SubjectBuilder setSubject_name(String subject_name) {
            this.subject_name = subject_name;
            return this;
        }

        public SubjectBuilder copy (Subject subject){
            this.subject_id = subject.subject_id;
            this.subject_name = subject.subject_name;
            return this;
        }

        public Subject build() {
            return new Subject(this);
        }

    }

}

