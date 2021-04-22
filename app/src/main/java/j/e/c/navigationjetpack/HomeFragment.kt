package j.e.c.navigationjetpack

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : Fragment(R.layout.fragment_home) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
      val button = view.findViewById<Button>(R.id.btnsend);
val navcontroller = findNavController();

        button.setOnClickListener(){
            findNavController().navigate(R.id.action_homeFragment_to_chooseReciverFragment)
        }


        viewBalance.setOnClickListener(){
            navcontroller.navigate(R.id.viewBalanceFragment)
        }

        viewTransction.setOnClickListener(){
            navcontroller.navigate(R.id.viewTransectionFragment)
        }
    }

}


