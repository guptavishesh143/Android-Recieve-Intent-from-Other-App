# Android-Recieve-Intent-from-Other-App
Receive simple data from other apps

bookmark_border
Just as an app can send data to other apps, it can also receive data from other apps as well. Think about how users interact with your application and what data types you want to receive from other applications. For example, a social networking application might be interested in receiving text content, like an interesting web URL, from another app.

Users of other apps frequently send data to your app through the Android Sharesheet or the intent resolver. Apps that send data to your app must set a MIME type for that data. Your app can receive data sent by another app in the following ways:

An Activity with a matching intent-filter tag in the manifest
Sharing Shortcuts published by your app.
Direct Share targets are deep links into a specific Activity within your app. They often represent a person or a group, and the Android Sharesheet shows them. For example, a messaging app can provide a Direct Share target for a person that deep links directly into a conversation with that person. See Provide Direct Share targets for detailed instructions.
