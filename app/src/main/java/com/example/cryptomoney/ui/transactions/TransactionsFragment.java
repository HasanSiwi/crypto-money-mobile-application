package com.example.cryptomoney.ui.transactions;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import com.example.cryptomoney.R;

public class TransactionsFragment extends Fragment {

  private TransactionsViewModel transactionsViewModel;

  public View onCreateView(@NonNull LayoutInflater inflater,
      ViewGroup container, Bundle savedInstanceState) {
    transactionsViewModel =
        ViewModelProviders.of(this).get(TransactionsViewModel.class);
    View root = inflater.inflate(R.layout.fragment_transactions, container, false);
    final TextView textView = root.findViewById(R.id.text_transactions);
    transactionsViewModel.getText().observe(this, new Observer<String>() {
      @Override
      public void onChanged(@Nullable String s) {
        textView.setText(s);
      }
    });
    return root;
  }
}