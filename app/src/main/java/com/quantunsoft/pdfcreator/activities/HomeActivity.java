package com.quantunsoft.pdfcreator.activities;

/*import static com.quantunsoft.pdfcreator.util.AdsUtility.mInterstitialAd;*/

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.quantunsoft.pdfcreator.util.AdsUtility;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import androidmarket.R;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {


    CardView cardImageToPDF, cardTextToPDF, cardQrToPDF,
            cardExcelToPDF, cardAddWatermark, cardHistory,
            cardViewFiles, cardSettings;
    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_home);

        setViews();
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {}
        });



/*        FrameLayout nativeAdFrameOne = findViewById(R.id.nativeAdFrameLayout);
        FrameLayout nativeAdFrameBack = findViewById(R.id.nativeAdFrameLayoutBack);*/
    /*    AdsUtility.loadNativeAd(this, nativeAdFrameOne);
        AdsUtility.loadNativeAd(this, nativeAdFrameBack);*/

    }

    private void setViews() {
        cardImageToPDF = findViewById(R.id.cardImageToPdf);
        cardTextToPDF = findViewById(R.id.cardTextToPdf);
        cardQrToPDF = findViewById(R.id.cardQrToPdf);
        cardExcelToPDF = findViewById(R.id.cardExcelToPdf);
        cardAddWatermark = findViewById(R.id.cardAddWatermark);
        cardHistory = findViewById(R.id.cardHistory);
        cardViewFiles = findViewById(R.id.cardViewFiles);
        cardSettings = findViewById(R.id.cardSettings);

        cardImageToPDF.setOnClickListener(this);
        cardTextToPDF.setOnClickListener(this);
        cardQrToPDF.setOnClickListener(this);
        cardExcelToPDF.setOnClickListener(this);
        cardAddWatermark.setOnClickListener(this);
        cardHistory.setOnClickListener(this);
        cardViewFiles.setOnClickListener(this);
        cardSettings.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.cardImageToPdf:

                AdRequest adRequest = new AdRequest.Builder().build();
                InterstitialAd.load(this,getResources().getString(R.string.interstial_id_admob), adRequest,
                        new InterstitialAdLoadCallback() {
                            @Override
                            public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                                // The mInterstitialAd reference will be null until
                                // an ad is loaded.
                                mInterstitialAd = interstitialAd;
                                Log.i("TAG", "onAdLoaded");
                                if (mInterstitialAd != null) {
                                    mInterstitialAd.show(HomeActivity.this);
                                } else {
                                    Log.d("me", "The interstitial ad wasn't ready yet.");
                                }
                            }

                            @Override
                            public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                                // Handle the error
                                Log.d("TAG", loadAdError.toString());
                                mInterstitialAd = null;
                            }
                        });

                Intent intent = new Intent(HomeActivity.this, SecondActivity.class);
                intent.putExtra("fragment", "imgToPdf");
                startActivity(intent);
                break;
            case R.id.cardTextToPdf:

                AdRequest adRequest2 = new AdRequest.Builder().build();
                InterstitialAd.load(this,getResources().getString(R.string.interstial_id_admob), adRequest2,
                        new InterstitialAdLoadCallback() {
                            @Override
                            public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                                // The mInterstitialAd reference will be null until
                                // an ad is loaded.
                                mInterstitialAd = interstitialAd;
                                Log.i("TAG", "onAdLoaded");
                                if (mInterstitialAd != null) {
                                    mInterstitialAd.show(HomeActivity.this);
                                } else {
                                    Log.d("me", "The interstitial ad wasn't ready yet.");
                                }
                            }

                            @Override
                            public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                                // Handle the error
                                Log.d("TAG", loadAdError.toString());
                                mInterstitialAd = null;
                            }
                        });
                Intent intent2 = new Intent(HomeActivity.this, SecondActivity.class);
                intent2.putExtra("fragment", "textToPdf");
                startActivity(intent2);

                break;
            case R.id.cardQrToPdf:
                AdRequest adRequest3 = new AdRequest.Builder().build();
                InterstitialAd.load(this,getResources().getString(R.string.interstial_id_admob), adRequest3,
                        new InterstitialAdLoadCallback() {
                            @Override
                            public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                                // The mInterstitialAd reference will be null until
                                // an ad is loaded.
                                mInterstitialAd = interstitialAd;
                                Log.i("TAG", "onAdLoaded");
                                if (mInterstitialAd != null) {
                                    mInterstitialAd.show(HomeActivity.this);
                                } else {
                                    Log.d("me", "The interstitial ad wasn't ready yet.");
                                }
                            }

                            @Override
                            public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                                // Handle the error
                                Log.d("TAG", loadAdError.toString());
                                mInterstitialAd = null;
                            }
                        });
                Intent intent3 = new Intent(HomeActivity.this, SecondActivity.class);
                intent3.putExtra("fragment", "qrToPdf");
                startActivity(intent3);

                break;
            case R.id.cardExcelToPdf:
                AdRequest adRequest4 = new AdRequest.Builder().build();
                InterstitialAd.load(this,getResources().getString(R.string.interstial_id_admob), adRequest4,
                        new InterstitialAdLoadCallback() {
                            @Override
                            public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                                // The mInterstitialAd reference will be null until
                                // an ad is loaded.
                                mInterstitialAd = interstitialAd;
                                Log.i("TAG", "onAdLoaded");
                                if (mInterstitialAd != null) {
                                    mInterstitialAd.show(HomeActivity.this);
                                } else {
                                    Log.d("me", "The interstitial ad wasn't ready yet.");
                                }
                            }

                            @Override
                            public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                                // Handle the error
                                Log.d("TAG", loadAdError.toString());
                                mInterstitialAd = null;
                            }
                        });
                Intent intent4 = new Intent(HomeActivity.this, SecondActivity.class);
                intent4.putExtra("fragment", "excelToPdf");
                startActivity(intent4);
                break;
            case R.id.cardAddWatermark:
                AdRequest adRequest5 = new AdRequest.Builder().build();
                InterstitialAd.load(this,getResources().getString(R.string.interstial_id_admob), adRequest5,
                        new InterstitialAdLoadCallback() {
                            @Override
                            public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                                // The mInterstitialAd reference will be null until
                                // an ad is loaded.
                                mInterstitialAd = interstitialAd;
                                Log.i("TAG", "onAdLoaded");
                                if (mInterstitialAd != null) {
                                    mInterstitialAd.show(HomeActivity.this);
                                } else {
                                    Log.d("me", "The interstitial ad wasn't ready yet.");
                                }
                            }

                            @Override
                            public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                                // Handle the error
                                Log.d("TAG", loadAdError.toString());
                                mInterstitialAd = null;
                            }
                        });
                Intent intent5 = new Intent(HomeActivity.this, SecondActivity.class);
                intent5.putExtra("fragment", "watermark");
                startActivity(intent5);


                break;
            case R.id.cardHistory:
                AdRequest adRequest6 = new AdRequest.Builder().build();
                InterstitialAd.load(this,getResources().getString(R.string.interstial_id_admob), adRequest6,
                        new InterstitialAdLoadCallback() {
                            @Override
                            public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                                // The mInterstitialAd reference will be null until
                                // an ad is loaded.
                                mInterstitialAd = interstitialAd;
                                Log.i("TAG", "onAdLoaded");
                                if (mInterstitialAd != null) {
                                    mInterstitialAd.show(HomeActivity.this);
                                } else {
                                    Log.d("me", "The interstitial ad wasn't ready yet.");
                                }
                            }

                            @Override
                            public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                                // Handle the error
                                Log.d("TAG", loadAdError.toString());
                                mInterstitialAd = null;
                            }
                        });
                Intent intent6 = new Intent(HomeActivity.this, SecondActivity.class);
                intent6.putExtra("fragment", "history");
                startActivity(intent6);

                break;
            case R.id.cardViewFiles:
                AdRequest adRequest7 = new AdRequest.Builder().build();
                InterstitialAd.load(this,getResources().getString(R.string.interstial_id_admob), adRequest7,
                        new InterstitialAdLoadCallback() {
                            @Override
                            public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                                // The mInterstitialAd reference will be null until
                                // an ad is loaded.
                                mInterstitialAd = interstitialAd;
                                Log.i("TAG", "onAdLoaded");
                                if (mInterstitialAd != null) {
                                    mInterstitialAd.show(HomeActivity.this);
                                } else {
                                    Log.d("me", "The interstitial ad wasn't ready yet.");
                                }
                            }

                            @Override
                            public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                                // Handle the error
                                Log.d("TAG", loadAdError.toString());
                                mInterstitialAd = null;
                            }
                        });

                Intent intent7 = new Intent(HomeActivity.this, SecondActivity.class);
                intent7.putExtra("fragment", "view");
                startActivity(intent7);
                break;
            case R.id.cardSettings:
                AdRequest adRequest8 = new AdRequest.Builder().build();
                InterstitialAd.load(this,getResources().getString(R.string.interstial_id_admob), adRequest8,
                        new InterstitialAdLoadCallback() {
                            @Override
                            public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                                // The mInterstitialAd reference will be null until
                                // an ad is loaded.
                                mInterstitialAd = interstitialAd;
                                Log.i("TAG", "onAdLoaded");
                                if (mInterstitialAd != null) {
                                    mInterstitialAd.show(HomeActivity.this);
                                } else {
                                    Log.d("me", "The interstitial ad wasn't ready yet.");
                                }
                            }

                            @Override
                            public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                                // Handle the error
                                Log.d("TAG", loadAdError.toString());
                                mInterstitialAd = null;
                            }
                        });
                Intent intent8 = new Intent(HomeActivity.this, SecondActivity.class);
                intent8.putExtra("fragment", "settings");
                startActivity(intent8);
                break;
        }

    }

    @Override
    public void onBackPressed() {
        ShowBackStuff();
    }
    boolean doubleBackToExitPressedOnce = false;

    public void ShowBackStuff() {
        AdRequest adRequest2 = new AdRequest.Builder().build();
        InterstitialAd.load(this,getResources().getString(R.string.interstial_id_admob), adRequest2,
                new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                        // The mInterstitialAd reference will be null until
                        // an ad is loaded.
                        mInterstitialAd = interstitialAd;
                        Log.i("TAG", "onAdLoaded");
                        if (mInterstitialAd != null) {
                            mInterstitialAd.show(HomeActivity.this);
                        } else {
                            Log.d("me", "The interstitial ad wasn't ready yet.");
                        }
                    }

                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        // Handle the error
                        Log.d("TAG", loadAdError.toString());
                        mInterstitialAd = null;
                    }
                });
        if (doubleBackToExitPressedOnce) {
            finish();
            return;
        }

        doubleBackToExitPressedOnce = true;
        RelativeLayout exitLayout = findViewById(R.id.exitLayout);
        exitLayout.setVisibility(View.VISIBLE);
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }


        public void Disappear(View view) {
        RelativeLayout rel = findViewById(R.id.exitLayout);
        rel.setVisibility(View.GONE);
    }
}