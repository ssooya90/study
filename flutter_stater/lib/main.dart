import 'package:flutter/material.dart';

// 최초 실행
void main() => runApp(
  MaterialApp(
    title: 'MyApp',
    home: MyApp(),
  ),
);

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context){
    return Scaffold(
      appBar: AppBar(
        title:Text('Welcome to Flutter'),
      ),
      body:Center(
        child:Text('Hello World'),
      ),
    );
  }
}