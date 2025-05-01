.class public Lcom/xinzhu/overmind/client/stub/StubBroadcastReceiver;
.super Landroid/content/BroadcastReceiver;
.source "StubBroadcastReceiver.java"


# static fields
.field public static final a:Ljava/lang/String; = "StubBroadcastReceiver"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    .line 1
    invoke-static {p2}, Lcom/xinzhu/overmind/client/stub/record/StubBroadcastRecord;->create(Landroid/content/Intent;)Lcom/xinzhu/overmind/client/stub/record/StubBroadcastRecord;

    .line 2
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "onReceive: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    return-void
.end method
