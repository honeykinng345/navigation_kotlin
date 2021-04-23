package j.e.c.navigationjetpack

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_send_reciver.*


class sendreciverFragment : Fragment(R.layout.fragment_send_reciver) {
private  val  args: sendreciverFragmentArgs by navArgs()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val reciverName = args.receivername
        name.text = "Send Cash TO $reciverName"


    }
}