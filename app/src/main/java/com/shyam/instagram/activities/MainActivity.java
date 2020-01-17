package com.shyam.instagram.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

import com.shyam.instagram.models.PostModel;
import com.shyam.instagram.R;
import com.shyam.instagram.models.StoryModel;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView btmNav;
//    Fragment selectedFragment = null;

    public static List<PostModel> listPosts = new ArrayList<>();
    public static List<StoryModel> listStories = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btmNav = findViewById(R.id.nav_view);

        getSupportActionBar().hide();

        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_search, R.id.navigation_add, R.id.navigation_liked, R.id.navigation_profile
        ).build();

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(btmNav, navController);


        listPosts.add(new PostModel("1","Jacques kallys", "batting", R.drawable.post5, R.drawable.post6));
        listPosts.add(new PostModel("2","Laxman", "Game On", R.drawable.post7, R.drawable.post8));
        listPosts.add(new PostModel("3","Flintof", "going to match!", R.drawable.post1, R.drawable.post1));
        listPosts.add(new PostModel("4","kumar Sangakara", "I am done with this.", R.drawable.profilepic2, R.drawable.profilepic2));


        listStories.add(new StoryModel("1","Flintonf", R.drawable.post1, 0));
        listStories.add(new StoryModel("Ganguly", R.drawable.post3));
        listStories.add(new StoryModel("1","Laxman", R.drawable.post7, 0));
        listStories.add(new StoryModel("Jason", R.drawable.post4));
    }




}
