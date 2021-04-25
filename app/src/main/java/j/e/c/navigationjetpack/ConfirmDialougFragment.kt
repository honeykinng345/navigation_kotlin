

package j.e.c.navigationjetpack

import android.app.AlertDialog
import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.navigation.NavArgs
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.frgment_confrim_dialoug.*


class ConfirmDialougFragment : BottomSheetDialogFragment() {

    private  val  agrs:ConfirmDialougFragmentArgs by  navArgs()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
       return  inflater.inflate(R.layout.frgment_confrim_dialoug,container,false)






    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val name =agrs.receivername
      val amount =  agrs.amount

        msg_tv.text = "Are u sure u want to send $amount,To $name"

        btn_csncel_dialoug.setOnClickListener(){
            dismiss()
        }

        btn_sent_dialoug.setOnClickListener(){
            Toast.makeText(requireContext(),"Done",Toast.LENGTH_LONG).show()
            dismiss()
        }
    }


}








