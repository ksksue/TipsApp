TipsApp
=======

このAndroidプロジェクトはActionBarActivityとWebViewを使ったTipsを表示するサンプルプロジェクトです。

このサンプルプロジェクトを使うにはサポートライブラリのv7 appcompatをローカル環境へ導入する必要があります。
その導入手順について以下説明します。

この方法はAndroid公式のページを参考にした手順です
http://developer.android.com/tools/support-library/setup.html#libs-with-res

#### v7 appcompatの導入方法
+ Eclipseの File > Importを選択し、Existing Android Code Into Workspaceを選択してNextをクリックします。
+ Root Directoryに <sdk>/extras/android/support/v7/appcompat/ を指定してFinishをクリックします。
+ するとandroid-support-v7-appcompatプロジェクトがインポートされます。
+ プロジェクト内のlibsディレクトリにあるandroid-support-v4.jar と android-support-v7-appcompat.jarを右クリックしてBuild Path > Add to Build Pathをクリックします。
+ プロジェクト自体を右クリックして Build Path > Configure Build Pathをクリックします。
+ Order and Exportタブを選択し、 android-support-v4.jar と android-support-v7-appcompat.jarにチェックを入れます。そしてAndroid Dependenciesはチェックを外します。
+ OKをクリックして終了です。

#### v7 appcompatを使うプロジェクト（ここではTipsApp）の設定
+ EclipseでTipsAppプロジェクトを右クリックし、Propertiesをクリックします。
+ Androidの項目を選択し、Libraryの項目のAddボタンをクリックします。
+ v7 appcompatのインポートが済んでいればandroid-support-v7-appcompatがリストにあるので選択します。
+ OKを押します。
