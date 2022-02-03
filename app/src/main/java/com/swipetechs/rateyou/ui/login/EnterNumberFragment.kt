package com.swipetechs.rateyou.ui.login

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.google.android.gms.common.api.ApiException
import com.google.android.gms.common.api.CommonStatusCodes
import com.google.android.gms.safetynet.SafetyNet
import com.google.android.gms.tasks.OnFailureListener
import com.google.android.gms.tasks.OnSuccessListener
import com.swipetechs.rateyou.R
import com.swipetechs.rateyou.databinding.EnterNumberFragmentBinding
import dagger.hilt.android.AndroidEntryPoint
import java.util.concurrent.Executor


@AndroidEntryPoint
class EnterNumberFragment : Fragment() {

    companion object {
        fun newInstance() = EnterNumberFragment()
    }

    private val viewModel by viewModels<LoginViewModel>()
    private lateinit var binding: EnterNumberFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(
            inflater, R.layout.enter_number_fragment, container, false
        )
        binding.lifecycleOwner = this
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        // TODO: Use the ViewModel

        binding.floatingActionButton.setOnClickListener {
//            SafetyNet.getClient(requireActivity())
//                .verifyWithRecaptcha("6Lf2vlQeAAAAAJ_UyzQQL9C34ceUfXq0Ve6bePgb")
//                .addOnSuccessListener(requireActivity()) { response ->
//                    val userResponseToken = response.tokenResult
//                    if (userResponseToken!!.isNotEmpty()) {
//                        viewModel.sendVerificationCode("+16479157848", requireActivity())
//                    }
//                }
//                .addOnFailureListener(requireActivity()) { exception ->
//                    if (exception is ApiException) {
//                        val apiException = exception as ApiException
//                        val statusCode = apiException.statusCode
//                    }
//                }
                                    viewModel.sendVerificationCode("+16479157848", requireActivity())
        }
    }

}