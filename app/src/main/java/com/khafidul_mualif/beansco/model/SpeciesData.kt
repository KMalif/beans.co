package com.khafidul_mualif.beansco.model

import com.example.beansco.R

object SpeciesData {

    private val speciesName = arrayOf(
        "Robusta",
        "Arabika",
        "Catimor",
        "Liberika",
        "Kolombia",
        "Gayo",
        "Jamaika",
        "Excelsa",
        "Toraja",
        "Geisha",
        "Luwak",
        "Catuai",
        "Pacamara"
        )

    private val speciesDesc = arrayOf(
        "Kopi Robusta merupakan keturunan beberapa spesies kopi, terutama Coffea canephora. Jenis kopi ini tumbuh baik di ketinggian 400-700 m dpl, temperatur 21-24° C dengan bulan kering 3-4 bulan secara berturut-turut dan 3-4 kali hujan kiriman. Kualitas buah lebih rendah dari Arabika dan Liberika. ",
        "Kopi arabika, juga dikenal sebagai kopi Arab, kopi semak Arab, atau kopi gunung, adalah spesies dari genus Coffea. Spesies ini diyakini sebagai spesies kopi pertama yang dibudidayakan, dan merupakan kultivar dominan, mewakili sekitar 60% dari produksi kopi global.",
        "Habitat asli varietas kopi Catimor adalah di Provinsi Timor Timor atau Timor Leste sekarang. Setelah tahun 1978, varietas hibrida ini disebar ke wilayah Flores dan Aceh. Tanamannya tumbuh subur di iklim tropis seperti yang dimiliki Indonesia. Tidak terlalu sejuk dan mendapat sinar matahari yang cukup.",
        "Kopi Liberika adalah jenis kopi yang berasal dari Liberia, Dan Afrika Barat. Kopi ini dapat tumbuh setinggi 9 meter dari tanah. Pada abad-19, jenis kopi ini didatangkan ke Indonesia untuk menggantikan kopi Arabika yang terserang oleh hama penyakit. ",
        "Kopi kolombia merupakan varietas terbaik dari kopi arabika. Kopi arabika mulai ditanam di Kolombia sekitar tahun 1800. Biji kopi yang dihasilkan di Kolombia merupakan yang paling banyak diproduksi setelah Brazil.\n" +
                "\n" +
                "Biji kopi kolombia terkenal utuh sempurna. Uniknya ada sedikit aroma rempah dan kakao kala kopi kolombia ini diseduh. Kamu bisa mendapatkan kopi kolombia di situs web ottencoffee.co.id yaitu Kopi Arabica Colombia \"Finca Veracruz\". Kopi seberat 200 gram ini dijual dengan harga Rp 125 ribu. ",
        "kopi Gayo, varietas kopi arabika yang dibudidayakan di dataran tinggi Gayo, Aceh Tengah, Indonesia. Kopi Gayo memiliki cita rasa yang khas dengan aroma dsn perisa yang kompleks dengan kekentalan yang kuat.",
        "Jamaican Blue Mountain Coffee atau Jamaika Blue Mountain Coffee adalah klasifikasi kopi yang ditanam di Blue Mountains of Jamaica. Kopi diperkenalkan ke Jamaika pada 1728. Banyak kopi Blue Mountain terbaik terkenal karena rasanya yang lembut dan tidak pahit.",
        "Jenis kopi excelsa adalah salah satu jenis kopi yang dibudidayakan juga di Indonesia. Namun, tidak semasif arabika atau robusta yang memang menjadi kebutuhan di pasar dunia. Alhasil, sang primadona terlelap dalam ketidakpopulerannya.",
        "Kopi Toraja adalah salah satu varian populer yang memiliki kualitas terbaik di Indonesia. Kopi yang berasal dari tanah Toraja, Sulawesi Selatan ini memiliki rasa yang khas dan karakter yang unik. Bernama latin Celeber Kalosi, kopi Toraja telah dikenal oleh para pencinta kopi di seluruh dunia. Menjadi salah satu kopi Indonesia yang telah diekspor, bersama-sama dengan kopi gayo, kopi luwak dan yang lainnya.",
        "Kopi Geisha, kadang-kadang disebut sebagai kopi Gesha, adalah varietas pohon kopi yang berasal dari hutan Gori Gesha, Ethiopia, meskipun sekarang tumbuh di beberapa negara lain di Afrika, Asia, dan Amerika.",
        "Kopi luwak adalah seduhan kopi menggunakan biji kopi yang diambil dari sisa kotoran luwak/musang kelapa. Biji kopi ini diyakini memiliki rasa yang berbeda setelah dimakan dan melewati saluran pencernaan luwak. ",
        "Catuai pertama kali diperkenalkan di Guatemala pada 1970, dimana saat ini Catuai menempati 20% dari keseluruhan produksi kopi di negara tersebut. Selanjutnya, Catuai diperkenalkan ke Honduras pada 1983 dan dan sekarang menyumbang hampir setengah dari semua Arabika yang dibudidayakan. Akhirnya Catuai diperkenalkan ke Costa Rica pada tahun 1985.",
        "Pacas mirip dengan bourbon, tetapi cenderung sedikit kurang manis. Hasilnya panen sekitar 20% lebih tinggi daripada bourbon. Ada beberapa citarasa pacas yang luar biasa, tetapi juga ada beberapa citarasanya yang lebih mengecewakan. Jarang citarasa pacas melebihi citarasa bourbon walaupun dari pertanian yang sama."
    )
    private val speciesImage = arrayOf(
        R.drawable.robusta,
        R.drawable.arabika,
        R.drawable.catimor,
        R.drawable.liberika,
        R.drawable.kolombia,
        R.drawable.gayo,
        R.drawable.jamaika,
        R.drawable.excelsa,
        R.drawable.toraja,
        R.drawable.geisha,
        R.drawable.luwak,
        R.drawable.catuai,
        R.drawable.pacamara

    )

    val listSpecies : ArrayList<Species>
        get() {
            val list = arrayListOf<Species>()
            for (position in speciesName.indices){
                val species = Species()
                species.name = speciesName[position]
                species.description = speciesDesc[position]
                species.image = speciesImage[position]
                list.add(species)
            }
            return list
        }

}