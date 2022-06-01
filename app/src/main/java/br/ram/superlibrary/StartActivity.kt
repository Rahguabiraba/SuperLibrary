package br.ram.superlibrary

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import br.ram.superlibrary.databinding.ActivityStartBinding

class StartActivity : AppCompatActivity(), BookClickListener {

    private lateinit var binding: ActivityStartBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStartBinding.inflate(layoutInflater)
        setContentView(binding.root)

        populateBooks()

        val startActivity = this
        binding.recyclerView.apply {
            layoutManager = GridLayoutManager(applicationContext, 3)
            adapter = CardAdapter(bookList, startActivity)
        }
    }

    override fun OnClick(book: Book) {
        val intent = Intent(applicationContext, DetailActivity::class.java)
        intent.putExtra(BOOK_ID_EXTRA, book.id)
        startActivity(intent)
    }

    private fun populateBooks() {

       val book1 = Book(
           R.drawable.wyam,
           "Paula Hawkings",
           "A Slow Fire Burning",
           "When a young man is found gruesomely murdered in a London houseboat, it triggers questions about three women who knew him. Laura is the troubled one-night-stand last seen in the victim's home. Carla is his grief-stricken aunt, already mourning the recent death of yet another family member."
       )
        bookList.add(book1)

        val book2 = Book(
            R.drawable.ttmc,
            "Louise Erdrich",
            "The Sentence",
            "Tookie, who has landed a job selling books after years of incarceration that she survived by reading \"with murderous attention,\" must solve the mystery of this haunting while at the same time trying to understand all that occurs in Minneapolis during a year of grief, astonishment, isolation, and furious reckoning."
        )
        bookList.add(book2)

        val book3 = Book(
            R.drawable.trlt,
            "Liane Moriarty",
            "Apples Never Fall",
            "Apples Never Fall follows the four Delaney siblings after the disappearance of their mother, Joy Delaney. The police soon identify their father, Stan, as a possible person of interest in her case."
        )
        bookList.add(book3)

        val book4 = Book(
            R.drawable.tmom,
            "Sally Rooney",
            "Beautiful World, Where are you?",
            "Beautiful world, where are you? is a question her two main female characters, best friends from college now on the cusp of 30, grapple with repeatedly in their struggles to figure out how they should live and find meaning in a troubled world that has become increasingly unviable on multiple levels")
        bookList.add(book4)

        val book5 = Book(
            R.drawable.ips,
            "Richard Powers",
            "Bewilderment",
            "In Bewilderment, Theo conjures up bedtime stories about alien life on a series of fictional planets, which he and his bereft son explore together in their imaginations. With names like Stasis, Isola, and Tedia, many of these planets offer cautionary allegories about the wages of isolation, loneliness, and depletion.")
        bookList.add(book5)

        val book6 = Book(
            R.drawable.iewu,
            "Jane GoodAll and Douglas Abrams",
            "Hope",
            "The Book of Hopes aims to comfort, inspire and encourage children during lockdown through delight, new ideas, ridiculous jokes and heroic tales."
        )
        bookList.add(book6)

        val book7 = Book(
            R.drawable.abtm,
            "Anthony Doerr",
            "Cloud Cuckoo Land",
            "It tells story of Aethon, a man who goes looking for a \"utopian city in the sky\" called Cloud Cuckoo Land. Along the way, he has many adventures (transformed into a donkey, captured, escapes, transformed into a fish, eaten by a sea creature, transformed into a crow, etc.) before he finally finds Cloud Cuckoo Land.")
        bookList.add(book7)

        bookList.add(book1)
        bookList.add(book2)
        bookList.add(book3)
        bookList.add(book4)
        bookList.add(book5)
        bookList.add(book6)
        bookList.add(book7)

    }


}