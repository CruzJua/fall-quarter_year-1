package com.example.gui_array_manager_lab6;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText etxtTitle;
    private EditText etxtRating;
    private EditText etxtArtist;
    private EditText etxtSearch;
    private TextView tvDisplayCurrent;
    private TextView tvDisplaySongInfo;
    private Song[] songs;
    private int currentSong;
    private int totalSongCount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        init();
    }

    public void init() {
        etxtTitle = findViewById(R.id.etxtTitle);
        etxtRating = findViewById(R.id.etxtRating);
        etxtArtist = findViewById(R.id.etxtArtist);
        etxtSearch = findViewById(R.id.etxtSearch);
        tvDisplayCurrent = findViewById(R.id.tvSongDisplayHeader);
        tvDisplaySongInfo = findViewById(R.id.tvDisplaySongInfo);
        songs = new Song[100];

    }


    public void onAdd(View v) {
        if (!etxtArtist.getText().toString().isBlank() && !etxtRating.getText().toString().isBlank() && !etxtTitle.getText().toString().isBlank()) {
            for (int i = 0; i < songs.length; i++) {
                if (songs[i] == null) {
                    songs[i] = new Song(etxtTitle.getText().toString(), etxtRating.getText().toString(), etxtArtist.getText().toString());
                    etxtArtist.setText("");
                    etxtRating.setText("");
                    etxtTitle.setText("");
                    totalSongCount++;
                    break;
                }
            }

        }
    }

    public void onSearch(View v) {
        tvDisplaySongInfo.setText("");
        if (!etxtSearch.getText().toString().isBlank()) {
            String searchBar = etxtSearch.getText().toString();
            etxtSearch.setText("");
            for (currentSong = 0; currentSong < songs.length; currentSong++) {
                if (songs[currentSong] == null) {
                        String songNotFound = "Sorry I couldn't find this song";
                        tvDisplaySongInfo.setText(songNotFound);
                } else if (songs[currentSong].getTitle().equalsIgnoreCase(searchBar)) {
                    String songInfo = tvDisplaySongInfo.getText().toString() + songs[currentSong] + "\n";
                    String current = "This is song " + (currentSong + 1) + " out of " + totalSongCount;
                    tvDisplaySongInfo.setText(songInfo);
                    tvDisplayCurrent.setText(current);
                    break;
                }
            }

        }
    }

    public void onDelete(View v) {
        if (!tvDisplaySongInfo.getText().toString().isBlank() && !tvDisplaySongInfo.getText().toString().equalsIgnoreCase("Sorry no song available") && !tvDisplaySongInfo.getText().toString().equalsIgnoreCase("Sorry I couldn't find this song")) {
            songs[currentSong] = new Song();
            currentSong--;
            if (currentSong >= 0) {
                if (songs[currentSong] == null) {
                    String noSongLeft = "Sorry no song available";
                    tvDisplaySongInfo.setText(noSongLeft);
                } else {
                    tvDisplaySongInfo.setText("");
                    totalSongCount--;
                    String songInfo = tvDisplaySongInfo.getText().toString() + songs[currentSong] + "\n";
                    String current = "This is song " + (currentSong + 1) + " out of " + songs.length;
                    tvDisplaySongInfo.setText(songInfo);
                    tvDisplayCurrent.setText(current);
                    for (int i = currentSong + 1; i <= totalSongCount; i++) {
                        songs[i] = songs[i + 1];

                    }
                }
            } else {
                tvDisplaySongInfo.setText("");
                currentSong++;
            }
        }
    }

    public void onClear(View v) {
        songs = new Song[100];
        tvDisplaySongInfo.setText("");
        tvDisplayCurrent.setText("");

    }

    public void onNext(View v) {
        if (tvDisplaySongInfo.getText().toString().isBlank() || tvDisplaySongInfo.getText().toString().equalsIgnoreCase("Sorry I couldn't find this song")) {
            return;
        } else {
            currentSong++;
            if (currentSong <= 99) {
                if (songs[currentSong] == null) {
                    if (tvDisplaySongInfo.getText().toString().equalsIgnoreCase("Sorry no song available")) {
                        currentSong--;
                    } else {
                        String noSongLeft = "Sorry no song available";
                        tvDisplaySongInfo.setText(noSongLeft);
                    }
                } else {
                    tvDisplaySongInfo.setText("");
                    String songInfo = tvDisplaySongInfo.getText().toString() + songs[currentSong] + "\n";
                    String current = "This is song " + (currentSong + 1) + " out of " + songs.length;
                    tvDisplaySongInfo.setText(songInfo);
                    tvDisplayCurrent.setText(current);
                    return;
                }
            } else {
                currentSong--;
            }

        }

    }

    public void onPrevious(View v) {
        if (tvDisplaySongInfo.getText().toString().isBlank() || tvDisplaySongInfo.getText().toString().equalsIgnoreCase("Sorry I couldn't find this song")) {
            return;
        } else {
            currentSong--;
            if (currentSong >= 0) {
                if (songs[currentSong] == null) {
                    if (tvDisplaySongInfo.getText().toString().equalsIgnoreCase("Sorry no song available")) {
                        currentSong++;
                    } else {
                        String noSongLeft = "Sorry no song available";
                        tvDisplaySongInfo.setText(noSongLeft);
                    }
                } else {
                    tvDisplaySongInfo.setText("");
                    String songInfo = tvDisplaySongInfo.getText().toString() + songs[currentSong] + "\n";
                    String current = "This is song " + (currentSong + 1) + " out of " + songs.length;
                    tvDisplaySongInfo.setText(songInfo);
                    tvDisplayCurrent.setText(current);
                    return;
                }
            } else {
                currentSong++;
            }

        }
    }

}