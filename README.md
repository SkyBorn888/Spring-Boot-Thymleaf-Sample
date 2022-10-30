# Spring-Boot 

## Folder / Files
- apps
   - demo 
      - Thymeleafを使ったHello World

## 開発環境
- Java 19
- Spring Boot 2.7.5 maven project
- macOS Ventura (CPU:Intel) 動作確認済み
- Windows 11　(CPU:Intel)　動作確認済み



## Spring Bootとは
Springプロジェクト群をパッケージ化し、シンプルに活用できるフレームワーク


## Java 環境構築

### Widnows
** ProgramFilesに入れるようなインストール方法はしない **


[https://jdk.java.net/19/](https://jdk.java.net/19/)
上記URLからWindowsの.zipファイルをダウンロード
(Armの奴はmacかlinuxに移動 or MicrosoftかRedHatがARMで動いてるWinodwsに入れれるOpenJDK作ってたはず調べてやってくれ。)

#### 環境変数
システム環境変数を開いて

- Path
C:\Users\hogehoge\openjdk-19.0.1_windows-x64_bin\jdk-19.0.1\bin
を追加 
<br>
- 変数名 = JAVA_HOME 
C:\Users\hogehoge\openjdk-19.0.1_windows-x64_bin\jdk-19.0.1



### mac


## Spring 実行コマンド
```shell
./mvnw spring-boot:run
```

## その他 README
[VScode上でSpring-Bootの環境構築](apps)