package com.physicaloid.tipsapp;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.ActionBarActivity;

public class TipsActivity extends ActionBarActivity {

    static final int MENUID_TIPS = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);
    }

    // 終了時にonDestroyが実行される。ただし今回は終了処理が必要ないため省略する
/*    @Override
    protected void onDestroy() {
        super.onDestroy();
    } */

    // アプリ開始時メニュー作成のために呼ばれるコールバックメソッド
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItem item = menu.add(Menu.NONE, MENUID_TIPS, Menu.NONE, "Tips");    // アクションボタンを生成
        item.setIcon(android.R.drawable.ic_menu_info_details);                  // 標準のインフォアイコンを使う
        MenuItemCompat.setShowAsAction(item, MenuItemCompat.SHOW_AS_ACTION_IF_ROOM);
        // アクションボタンの数が多くなっても収まる範囲で表示させるSHOW_AS_ACTION_IF_ROOM属性にする
        return true;
    }

    // アクションボタンがタップされたときに呼ばれるコールバックメソッド
    @Override
    public boolean onOptionsItemSelected(MenuItem item) { 
        switch (item.getItemId()) {
        case MENUID_TIPS:
            showTipsDialog();   // Tipsダイアログを表示
            break;
        default:
            break;
        }
        return true;
    }

    /**
     * Tipsダイアログを表示
     */
    private void showTipsDialog() {
        WebView webview = new WebView(this);    // WebViewオブジェクト生成
//      webview.loadUrl("file:///data/data/com.physicaloid.tipsapp/databases/webview.db");
        webview.loadUrl("file:///android_asset/tips/index.html"); // assetsディレクトリのtips/index.htmlファイルを読み込む

        AlertDialog.Builder dialog = new AlertDialog.Builder(this); // ダイアログオブジェクト生成
        dialog.setTitle("Tips");                // ダイアログのタイトル設定
        dialog.setView(webview);                // ダイアログビューにWebViewをセット
        dialog.setPositiveButton("OK", null);   // ダイアログにOKボタンをつける
        dialog.show();                          // ダイアログを表示
    }
}
