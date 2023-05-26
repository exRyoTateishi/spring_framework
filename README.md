# Spring Framework

## 初期設定
docker volumeの作成
```Shell
docker volume create m2
```

## Dockerの操作
demoディレクトリに移動してdocker-composeを操作する
```Shell
cd demo
```
<br>

Dockerの起動方法：
```Shell
docker-compose up
```
<br>

バックグラウンドでDockerを起動する場合：
```Shell
docker-compose up -d
```  
<br>

Dockerの再起動（コードを書き換えた時に使用する）：
```Shell
docker-compose restart
```  
<br>

Dockerの終了方法:
```Shell
docker-compose down
```  
