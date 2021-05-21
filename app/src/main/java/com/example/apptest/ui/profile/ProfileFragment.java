package com.example.apptest.ui.profile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.apptest.R;
import com.example.apptest.ui.profile.Adapter.ProfileAdapter;
import com.example.apptest.ui.profile.model.User;

import java.util.ArrayList;

public class ProfileFragment extends Fragment {
    RecyclerView recyclerViewUser;
    ArrayList<User> users = new ArrayList<>();

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_profile, container, false);
        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerViewUser = view.findViewById(R.id.rcv_user);
        addUser();

    }

    private void addUser() {
        users.add(new User(R.drawable.backgroud_ava, "Su","20","University degree","Vietnam"));
        users.add(new User(R.drawable.backgroud_ava, "Duy","20","University degree","Vietnam"));
        initRecyclerViewUser();
    }

    private void initRecyclerViewUser() {
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        recyclerViewUser.setLayoutManager(layoutManager);
        ProfileAdapter adapter = new ProfileAdapter(users, getContext());
        recyclerViewUser.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}