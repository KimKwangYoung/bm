package com.example.bm_invest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.widget.TextView;

public class SettingActivity extends AppCompatActivity {

    TextView balanceTextView;
    String userId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        balanceTextView = findViewById(R.id.tv_balance);

        userId = "올바른코드";
        String changes = "님\n잔액은 2,000,000won 입니다.";
        String full = userId + changes;

        balanceTextView.setText(getUserIdSpan(full));

    }

    private SpannableString getUserIdSpan(String full){
        SpannableString spannable = new SpannableString(full);
        spannable.setSpan(new UnderlineSpan(), 0, userId.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        return spannable;
    }
}
