package com.example.ift2905_dev3.ui.search;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ift2905_dev3.Adapter;
import com.example.ift2905_dev3.R;
import com.example.ift2905_dev3.searchFriends;

public class SearchFragment extends Fragment {

    private SearchViewModel friendsViewModel;
    private String names[] ;
    private String description[];
    private RecyclerView rc;
    private View view;
    private int images [];
    private Adapter adapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        friendsViewModel =
                new ViewModelProvider(this).get(SearchViewModel.class);
        View root = inflater.inflate(R.layout.fragment_search, container, false);

        view = inflater.inflate(R.layout.fragment_search,container,false);
        return root;
    }


    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {


        names = new String[] {"Jacques Charet", "Amin Meslioui", "Jon Doe", "Kill Bill", "Kratos Artheus", "Ezio Auditore"};
        description = new String[] {"Jaime jouer aux echecs et j'etudie en informatique", "Je ne sais pas quoi faire et je code cette demo", "Personne ne sait qui je suis et personne ne sait dans quelle programme je suis", "Je suis en bio-informatique",
                "J'ai combattu mon pere", "Je me suis venger de ma famille"};


        adapter =  new Adapter(getActivity().getApplicationContext(), names, description);
        rc = view.findViewById(R.id.searchList);
        LinearLayoutManager manager = new LinearLayoutManager(getActivity().getApplicationContext());
        rc.setLayoutManager(manager);
        rc.setAdapter(adapter);
        rc.setHasFixedSize(true);

    }
}