package com.somildoshi.ns_birthday;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    Window window;
    private ImageSlider imageSlider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        if(Build.VERSION.SDK_INT >= 20) {
            window = this.getWindow();
            window.setStatusBarColor(this.getResources().getColor(R.color.purples));
        }

        imageSlider = findViewById(R.id.imageSlider);

        ArrayList<SlideModel> slideModels = new ArrayList<>();

        slideModels.add(new SlideModel(R.drawable.first,"Nidhi Shah", ScaleTypes.CENTER_INSIDE));

        slideModels.add(new SlideModel(R.drawable.s1,"Happiest Birthday to my cute friend 😊 since 27th march, 2021 ❤️", ScaleTypes.CENTER_INSIDE));

        slideModels.add(new SlideModel(R.drawable.s2, "It's just because of you I could be friend with amazing 4 sisters. The time spent with 4 of you are so memorable for me ❤️.", ScaleTypes.FIT));

        slideModels.add(new SlideModel(R.drawable.s3, "This was the first birthday when any of my friend surprised me at night. I am glad that you were there with me on that day 😊. And also this was finally my first picture with you ❤️.", ScaleTypes.FIT));

        slideModels.add(new SlideModel(R.drawable.s4, "You look great in traditional especially in yellow colour and that memorizing smile 😊.", ScaleTypes.FIT));

        slideModels.add(new SlideModel(R.drawable.s5, "Cutiest photo ❤️ with perfect matching garments.", ScaleTypes.CENTER_INSIDE));

        slideModels.add(new SlideModel(R.drawable.s6, "This gift can't be complete without including the picture with which you are so obsessed about ❤️❤️",ScaleTypes.FIT));

        slideModels.add(new SlideModel(R.drawable.s7, "Our friendship has gone through many ups and downs. This picture represents the strength of our friendship 😊❤️",ScaleTypes.FIT));

        slideModels.add(new SlideModel(R.drawable.s8, "Your honesty and your jolly nature is the reason why your so adorable ❤️. And your smile is just like cherry on the cake 😊",ScaleTypes.FIT));

        slideModels.add(new SlideModel(R.drawable.s9, "Our one of the best picture and moment ❤️. No words can describe it.",ScaleTypes.FIT));

        slideModels.add(new SlideModel(R.drawable.s10, "For me you hold great importance in my life 😊❤️",ScaleTypes.FIT));

        slideModels.add(new SlideModel(R.drawable.s11, "16th july, 2021 is the day which is memorable for me. In terms of our friendship not because of the things I said to you but due to the actions of your after hearing those statements.",ScaleTypes.FIT));

        slideModels.add(new SlideModel(R.drawable.s11, "This day I came to know how good you are as a person and as a friend ❤️. You chose to stand by me and be my friend instead of backing off ❤️. ",ScaleTypes.FIT));

        slideModels.add(new SlideModel(R.drawable.s12, "I am really sorry dost for letting you down in some situations. I have always worked on your feedbacks and tried to never repeat it again.", ScaleTypes.FIT));

        slideModels.add(new SlideModel(R.drawable.s13, "This picture takes me to the moments with my patta gang ❤️. All laughter and quality time spent together will be intact even after you all shifting to rajesh park.", ScaleTypes.FIT));

        slideModels.add(new SlideModel(R.drawable.s14, "I really had no words to describe you when I saw you in this attire ❤️.", ScaleTypes.FIT));

        slideModels.add(new SlideModel(R.drawable.s15, "This picture will be reference to the one for which you would remember char banglow. Apart from this would remind you the promise which you gave me (after I go to US)", ScaleTypes.FIT));

        slideModels.add(new SlideModel(R.drawable.s16, "lastly mai tane aa gift as FRIEND aapyu che (etle pls dimag ma ghoda daudaine maru gift kharab nai karti). Tu bhale mane only friend / best friend / good friend je pan samje, tu mara maate mari best friend che and rese ❤️", ScaleTypes.FIT));

        slideModels.add(new SlideModel(R.drawable.s17, "Bhale hu words thi vaato nathi karto tara saathe etlu but mara actions speaks for me. The first person apart from my family whom I would miss when I'll go to US is Nidhi Shah ❤️. Dost yaar hu tane bou miss karis ❤️", ScaleTypes.FIT));

        slideModels.add(new SlideModel(R.drawable.s17, "Thank you for being there for me. Hope you liked a small gift from your chaplo 😊. Dost always keep smiling 😊", ScaleTypes.FIT));

        imageSlider.setImageList(slideModels, ScaleTypes.FIT);
    }
}