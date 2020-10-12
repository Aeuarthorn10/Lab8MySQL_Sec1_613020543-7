package layout

import android.content.Context
import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.lab8mysql_queryinsert.R

class StudentsAdapter(val item: List<Student>,val context: Context):RecyclerView.Adapter <ViewHolder>(),
    Parcelable {
    constructor(parcel: Parcel) : this(
        TODO("item"),
        TODO("context")
    ) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view_item = LayoutInflater.from(parent.context).inflate(R.layout.std_item_layout,parent, false)
        return ViewHolder(view_item)
    }



    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvID.text ="ID:" + item[position].std_id
        holder.tvName.text = item[position].std_name
        holder.tvAge.text ="Age:" +item[position].std_age.toString()

    }
    override fun getItemCount(): Int {
        return item.size
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<StudentsAdapter> {
        override fun createFromParcel(parcel: Parcel): StudentsAdapter {
            return StudentsAdapter(parcel)
        }

        override fun newArray(size: Int): Array<StudentsAdapter?> {
            return arrayOfNulls(size)
        }
    }

}
