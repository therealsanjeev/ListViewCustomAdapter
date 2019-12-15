package com.example.listviewperformance;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvCorses;
    ArrayList<Course> courses= Course.generateNRandomCourses(100);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvCorses=findViewById(R.id.lvCourses);
        courseAdapter cA = new courseAdapter();
        lvCorses.setAdapter(cA);


    }

    class courseAdapter extends BaseAdapter {


        @Override
        public int getCount() {
            return courses.size();
        }

        @Override
        public Course getItem(int position) {
            return courses.get(position);
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            View itemView = getLayoutInflater().inflate(
                    R.layout.list_item_course,
                    parent,
                    false
            );
            TextView tvCourseName= itemView.findViewById(R.id.tvCourse);
            TextView tvTeacherName= itemView.findViewById(R.id.tvTeachers);
            TextView tvLecture= itemView.findViewById(R.id.tvLectures);
            Course course = getItem(position);
            tvCourseName.setText(course.getName());
            tvTeacherName.setText(course.getTeachername());
            tvLecture.setText(String.valueOf(course.getLecture()));

            return itemView;
        }
    }
}
