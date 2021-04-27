package com.example.task1;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class studymaterial extends Fragment  {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.studymaterial, container, false);
        v.findViewById(R.id.material1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/1mjtpt6bVt0_WpSawZke-bSrK3GraPKgt?usp=sharing")));
            }
        });
        v.findViewById(R.id.material2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/1aultXWJcVjEA2DJzsLFzCPa7eEde6vSB?usp=sharing")));
            }
        });
        v.findViewById(R.id.material3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/1-1oa-SKsN3ZaJRhyqOafwHUVqv1slLFp?usp=sharing")));
            }
        });
        v.findViewById(R.id.material4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/1yB95BJrYHYN-8ZwVXuJM25oNqmdGQxBq?usp=sharing")));
            }
        });
        v.findViewById(R.id.material5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1AsbFOjR3qsoLb9Oc4Q1EwmmVv2OtfUEL/view?usp=sharing")));
            }
        });
        return v;
    }
}
