package com.example.smartdesign;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link OperateFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class OperateFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public OperateFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment OperateFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static OperateFragment newInstance(String param1, String param2) {
        OperateFragment fragment = new OperateFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_operate, container, false);

        final ImageButton Hall = (ImageButton)view.findViewById(R.id.hall);
        Hall.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("WrongConstant")
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), OnOff.class);
                startActivity(intent);
                Toast.makeText(getContext(), "Thiss is Hall", Toast.LENGTH_SHORT).show();

                /*LinearLayout LLone = (LinearLayout) v.findViewById(R.id.LLone);
                LLone.setVisibility(View.GONE);*/


            }
        });

        ImageButton Bedone = (ImageButton)view.findViewById(R.id.bedo);
        Bedone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), OnOff.class);
                startActivity(intent);
                Toast.makeText(getContext(), "Thiss is BedRoom One", Toast.LENGTH_SHORT).show();

            }
        });

        ImageButton Bedtwo = (ImageButton)view.findViewById(R.id.bedt);
        Bedtwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), OnOff.class);
                startActivity(intent);
                Toast.makeText(getContext(), "Thiss is BedRoom Two", Toast.LENGTH_SHORT).show();

            }
        });

        ImageButton Kitchen = (ImageButton)view.findViewById(R.id.kitch);
        Kitchen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), OnOff.class);
                startActivity(intent);
                Toast.makeText(getContext(), "Thiss is KitchenRoom", Toast.LENGTH_SHORT).show();

            }
        });

        ImageButton Washr = (ImageButton)view.findViewById(R.id.washr);
        Washr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), OnOff.class);
                startActivity(intent);
                Toast.makeText(getContext(), "Thiss is WashRoom", Toast.LENGTH_SHORT).show();

            }
        });

        return view;


    }
}