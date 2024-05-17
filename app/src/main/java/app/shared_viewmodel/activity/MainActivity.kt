package app.shared_viewmodel.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import app.shared_viewmodel.R
import app.shared_viewmodel.databinding.ActivityMainBinding
import app.shared_viewmodel.fragment.FragmentA
import app.shared_viewmodel.fragment.FragmentB

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (savedInstanceState == null) {
            supportFragmentManager.commit {
                setReorderingAllowed(true)
                add(R.id.fragment_container_view, FragmentA(), "FragmentA")
                add(R.id.fragment_container_view, FragmentB(), "FragmentB")
            }
        }
    }
}