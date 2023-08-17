package com.example.challenges.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.challenges.R;
import com.example.challenges.model.LichThi;

import java.util.List;

public class LichThiAdapter extends RecyclerView.Adapter<LichThiAdapter.LichThiViewHolder> {

    private List<LichThi> lichThi;

    public LichThiAdapter(List<LichThi> lichThi) {
        this.lichThi = lichThi;
    }
    public void updateDataLichThi(List<LichThi> newData){
        lichThi.clear();
        lichThi.addAll(newData);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public LichThiAdapter.LichThiViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_lich_thi,parent,false);
        return new LichThiViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LichThiAdapter.LichThiViewHolder holder, int position) {
        LichThi lichthi = lichThi.get(position);
        holder.tvPhong.setText(lichthi.getPhong());
        holder.tvCaThi.setText(lichthi.getCa_thi());
        holder.tvNgayThi.setText(lichthi.getNgay_thi());
        holder.tvMaMon.setText(lichthi.getMa_mon());
        holder.tvTenMon.setText(lichthi.getTen_mon());
    }

    @Override
    public int getItemCount() {
        return lichThi.size();
    }

    public class LichThiViewHolder extends RecyclerView.ViewHolder {
        private TextView tvPhong, tvCaThi, tvNgayThi, tvMaMon, tvTenMon;
        public LichThiViewHolder(@NonNull View itemView) {
            super(itemView);
            tvPhong = itemView.findViewById(R.id.tvPhong);
            tvCaThi = itemView.findViewById(R.id.tvCaHoc);
            tvNgayThi = itemView.findViewById(R.id.tvNgayHoc);
            tvMaMon = itemView.findViewById(R.id.tvMaMon);
            tvTenMon = itemView.findViewById(R.id.tvTenMon);
        }
    }
}
