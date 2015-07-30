package com.lifeistech.android.original_app_final;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;
import android.content.Intent;



public class CountPage extends ActionBarActivity {


    TextView text;
    TextView text2;
    TextView text3;
    TextView text4;

    ImageView imageView2;
    ImageView imageView3;
    ImageView imageView4;


    int s_number;
    int b_number;
    int o_number;

    int r_number;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count_page);


        text = (TextView) findViewById(R.id.textView);
        text2 = (TextView) findViewById(R.id.textView2);
        text3 = (TextView) findViewById(R.id.textView3);
        text4 = (TextView) findViewById(R.id.textView4);

        imageView2 = (ImageView) findViewById(R.id.imageView2);
        imageView3 = (ImageView) findViewById(R.id.imageView3);
        imageView4 = (ImageView) findViewById(R.id.imageView4);


        text.setText("0");
        text2.setText("0");
        text3.setText("0");
        text4.setText("");
        r_number = 0;


        imageView2.setVisibility(View.INVISIBLE);

        imageView3.setVisibility(View.INVISIBLE);


        imageView4.setVisibility(View.INVISIBLE);


        /*
        imageButton.setVisibility(View.INVISIBLE);
        imageButton2.setVisibility(View.INVISIBLE);
        imageButton3.setVisibility(View.INVISIBLE);
        */


    }

    public void bt_st(View v) {
        if (s_number < 2) {
            s_number = s_number + 1;
            text.setText(String.valueOf(s_number));
            text2.setText(String.valueOf(b_number));
            text3.setText(String.valueOf(o_number));
            text4.setText(String.valueOf("ストライク"));

        } else if (s_number == 2) {
            if (o_number == 2) {
                //�X���[�X�A�E�g�̎�
                o_number = o_number + 1;
                r_number = r_number * 0;
                text.setText(String.valueOf("3"));
                text2.setText(String.valueOf(b_number));
                text3.setText(String.valueOf("3"));
                text4.setText(String.valueOf("3アウトチェンジ!!"));
                imageView2.setImageResource(R.drawable.runner1);
                imageView2.setVisibility(View.INVISIBLE);
                imageView3.setImageResource(R.drawable.runner1);
                imageView3.setVisibility(View.INVISIBLE);
                imageView4.setImageResource(R.drawable.runner1);
                imageView4.setVisibility(View.INVISIBLE);

            } else if (o_number < 2) {
                //�P���Q�A�E�g�̎�
                s_number = s_number + 1;
                o_number = o_number + 1;
                text.setText(String.valueOf("3"));
                text2.setText(String.valueOf(b_number));
                text3.setText(String.valueOf(o_number));
                text4.setText(String.valueOf("アウト!!"));

            } else if (o_number > 2) {
                s_number = s_number * 0;
                b_number = b_number * 0;
                o_number = o_number * 0;
                text.setText(String.valueOf(s_number));
                text2.setText(String.valueOf(b_number));
                text3.setText(String.valueOf(o_number));
                text4.setText(String.valueOf(""));
            }

        } else if (s_number > 2) {
            s_number = s_number * 0;
            b_number = b_number * 0;
            text.setText(String.valueOf(s_number));
            text2.setText(String.valueOf(b_number));
            text3.setText(String.valueOf(o_number));
            text4.setText(String.valueOf(""));
        }
    }

    public void bt_ba(View v) {
        if (b_number < 3) {
            b_number = b_number + 1;
            text.setText(String.valueOf(s_number));
            text2.setText(String.valueOf(b_number));
            text4.setText(String.valueOf("ボール"));

        } else if (b_number == 3) {
            if (r_number < 1) {
                s_number = s_number * 0;
                b_number = b_number + 1;
                text.setText(String.valueOf(s_number));
                text2.setText(String.valueOf("4"));
                text4.setText(String.valueOf("フォアボール"));
                r_number = r_number + 1;
                imageView2.setImageResource(R.drawable.runner1);
                imageView2.setVisibility(View.VISIBLE);

            } else if (r_number == 1) {
                //�����i�[��ۂ�����P�E�Q�ۂɂ���
                r_number = r_number + 10;
                imageView3.setImageResource(R.drawable.runner1);
                imageView3.setVisibility(View.VISIBLE);
                s_number = s_number * 0;
                b_number = b_number + 1;
                text.setText(String.valueOf(s_number));
                text2.setText(String.valueOf("4"));
                text4.setText(String.valueOf("フォアボール"));
            } else if (r_number == 10) {
                //�����i�[�Q��
                r_number = r_number + 1;
                imageView2.setImageResource(R.drawable.runner1);
                imageView2.setVisibility(View.VISIBLE);
                s_number = s_number * 0;
                b_number = b_number + 1;
                text.setText(String.valueOf(s_number));
                text2.setText(String.valueOf("4"));
                text4.setText(String.valueOf("フォアボール"));

            } else if (r_number == 11) {
                //�����i�[1�E2��
                r_number = r_number + 100;
                imageView4.setImageResource(R.drawable.runner1);
                imageView4.setVisibility(View.VISIBLE);
                s_number = s_number * 0;
                b_number = b_number + 1;
                text.setText(String.valueOf(s_number));
                text2.setText(String.valueOf("4"));
                text4.setText(String.valueOf("フォアボール"));

            } else if (r_number == 100) {
                //�����i�[3��
                r_number = r_number + 1;
                imageView2.setImageResource(R.drawable.runner1);
                imageView2.setVisibility(View.VISIBLE);
                s_number = s_number * 0;
                b_number = b_number + 1;
                text.setText(String.valueOf(s_number));
                text2.setText(String.valueOf("4"));
                text4.setText(String.valueOf("フォアボール"));

            } else if (r_number == 101) {
                //�����i�[1�E3��
                r_number = r_number + 10;
                imageView3.setImageResource(R.drawable.runner1);
                imageView3.setVisibility(View.VISIBLE);
                s_number = s_number * 0;
                b_number = b_number + 1;
                text.setText(String.valueOf(s_number));
                text2.setText(String.valueOf("4"));
                text4.setText(String.valueOf("フォアボール"));

            } else if (r_number == 110) {
                //�����i�[�Q�E�R��
                r_number = r_number + 1;
                imageView2.setImageResource(R.drawable.runner1);
                imageView2.setVisibility(View.VISIBLE);
                s_number = s_number * 0;
                b_number = b_number + 1;
                text.setText(String.valueOf(s_number));
                text2.setText(String.valueOf("4"));
                text4.setText(String.valueOf("フォアボール"));

            } else if (r_number == 111) {
                //�����i�[����
                text4.setText(String.valueOf("押し出し"));
                s_number = s_number * 0;
                b_number = b_number + 1;
                text.setText(String.valueOf("0"));
                text2.setText(String.valueOf("4"));
                text3.setText(String.valueOf(o_number));
            }


        } else if (b_number > 3) {
            s_number = s_number * 0;
            b_number = b_number * 0;
            text.setText(String.valueOf(s_number));
            text2.setText(String.valueOf(b_number));
            text3.setText(String.valueOf(o_number));
            text4.setText(String.valueOf(""));
        }
    }


    public void bt_ou(View v) {
        if (o_number < 2) {
            s_number = s_number * 0;
            b_number = b_number * 0;
            o_number = o_number + 1;


            text.setText(String.valueOf(s_number));
            text2.setText(String.valueOf(b_number));
            text3.setText(String.valueOf(o_number));

            text4.setText(String.valueOf("アウト!!"));
        } else if (o_number == 2) {
            s_number = s_number * 0;
            b_number = b_number * 0;
            o_number = o_number + 1;
            r_number = r_number * 0;
            text.setText(String.valueOf(s_number));
            text2.setText(String.valueOf(b_number));
            text3.setText(String.valueOf("3"));


            text4.setText(String.valueOf("3アウトチェンジ!!"));
        } else if (o_number > 2) {
            s_number = s_number * 0;
            b_number = b_number * 0;
            o_number = o_number * 0;
            r_number = r_number * 0;
            text.setText(String.valueOf(s_number));
            text2.setText(String.valueOf(b_number));
            text3.setText(String.valueOf(o_number));
            text4.setText(String.valueOf(""));
            imageView2.setImageResource(R.drawable.runner1);
            imageView2.setVisibility(View.INVISIBLE);
            imageView3.setImageResource(R.drawable.runner1);
            imageView3.setVisibility(View.INVISIBLE);
            imageView4.setImageResource(R.drawable.runner1);
            imageView4.setVisibility(View.INVISIBLE);
        }
    }


    public void bt_1run(View v) {
        if (r_number == 0 || r_number == 10 || r_number == 100 || r_number == 110) {

            r_number = r_number + 1;

            imageView2.setImageResource(R.drawable.runner1);
            imageView2.setVisibility(View.VISIBLE);

        } else {
            r_number = r_number - 1;
            imageView2.setImageResource(R.drawable.runner1);
            imageView2.setVisibility(View.INVISIBLE);
        }
    }

    public void bt_2run(View v) {
        if (r_number == 0 || r_number == 1 || r_number == 101 || r_number == 100) {

            r_number = r_number + 10;

            imageView3.setImageResource(R.drawable.runner1);
            imageView3.setVisibility(View.VISIBLE);

        } else {
            r_number = r_number - 10;
            imageView3.setImageResource(R.drawable.runner1);
            imageView3.setVisibility(View.INVISIBLE);
        }
    }

    public void bt_3run(View v) {
        if (r_number == 0 || r_number == 1 || r_number == 10 || r_number == 11) {

            r_number = r_number + 100;

            imageView4.setImageResource(R.drawable.runner1);
            imageView4.setVisibility(View.VISIBLE);

        } else {
            r_number = r_number - 100;
            imageView4.setImageResource(R.drawable.runner1);
            imageView4.setVisibility(View.INVISIBLE);
        }
    }





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_count_page, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void bt_home(View view){
        switch(view.getId()){
            case R.id.button_home:
                Intent intent=new Intent(this,MainActivity.class);
                startActivity(intent);
                break;
        }
    }
}
