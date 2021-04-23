package j.e.c.navigationjetpack

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_choose_reciver.*


class ChooseReciverFragment : Fragment(R.layout.fragment_choose_reciver) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)




        send.setOnClickListener(){

            val receiverName = edt1.text.toString();
           val action  =  ChooseReciverFragmentDirections.actionChooseReciverFragmentToSendreciverFragment(receiverName)


            findNavController().navigate(action)
        }


    }

}