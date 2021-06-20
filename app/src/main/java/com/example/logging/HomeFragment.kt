package com.example.logging


import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup



class HomeFragment : Fragment() {
    // TODO: Rename and change types of parameters


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("HomeFragment", "OnCreate Called")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        Log.i("HomeFragment", "OnCreateView Called")
        return inflater.inflate(R.layout.fragment_home, container, false)

    }

// TODO: Rename method, update argument and hook method into UI event


    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i("HomeFragment", "OnAttach Called")
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.i("HomeFragment", "OnActivityCreated Called")
    }

    override fun onStart() {
        super.onStart()
        Log.i("HomeFragment", "OnStart Called")
    }

    override fun onResume() {
        super.onResume()
        Log.i("HomeFragment", "OnResume Called")
    }

    override fun onPause() {
        super.onPause()
        Log.i("HomeFragment", "OnPause Called")
    }

    override fun onStop() {
        super.onStop()
        Log.i("HomeFragment", "OnStop Called")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i("HomeFragment", "OnDestroyView Called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("HomeFragment", "OnDestroy Called")
    }

    override fun onDetach() {
        super.onDetach()
        Log.i("HomeFragment", "OnDetach Called")
    }


}
