package com.example.ansrcoach;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.example.ansrcoach.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);


        binding.layout1.btnNext1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    // Retrieve layout:
                binding.upperTV.setText("Answer this question will help you understand your level of emotion.");
                binding.progressBar.setProgress(50);
                View view1 = binding.layout2.cardView;
                view1.setVisibility(View.VISIBLE);
                TranslateAnimation animate = new TranslateAnimation(0, 0, view1.getHeight(), 0);

                // duration of animation
                animate.setDuration(500);
                animate.setFillAfter(true);
                view1.startAnimation(animate);
                binding.layout1.getRoot().setVisibility(View.GONE);
            }
        });
        binding.layout2.btnNext2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Retrieve layout:
                binding.upperTV.setText("You'll be able to better understand your emotions and what makes them arise by observing your behaviour change and the reasons why it made you feel bad.");
                binding.progressBar.setProgress(75);

                View view1 = binding.layout3.cardView;
                view1.setVisibility(View.VISIBLE);
                TranslateAnimation animate = new TranslateAnimation(0, 0, view1.getHeight(), 0);

                // duration of animation
                animate.setDuration(500);
                animate.setFillAfter(true);
                view1.startAnimation(animate);
                binding.layout2.getRoot().setVisibility(View.GONE);
            }
        });

        binding.layout3.btnNext3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        binding.layout1.btnBack1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        binding.layout2.btnBack2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.upperTV.setText("This is meant to realise how much this emotion till now.");
                binding.progressBar.setProgress(25);
                View view1 = binding.layout1.cardView;
                view1.setVisibility(View.VISIBLE);
                TranslateAnimation animate = new TranslateAnimation(0, 0, view1.getHeight(), 0);

                // duration of animation
                animate.setDuration(500);
                animate.setFillAfter(true);
                view1.startAnimation(animate);
                binding.layout1.getRoot().setVisibility(View.VISIBLE);
            }
        });

        binding.layout3.btnBack3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.upperTV.setText("Answer this question will help you understand your level of emotion.");
                binding.progressBar.setProgress(50);
                View view1 = binding.layout2.cardView;
                view1.setVisibility(View.VISIBLE);
                TranslateAnimation animate = new TranslateAnimation(0, 0, view1.getHeight(), 0);

                // duration of animation
                animate.setDuration(500);
                animate.setFillAfter(true);
                view1.startAnimation(animate);
                binding.layout2.getRoot().setVisibility(View.VISIBLE);
            }
        });
    }

}