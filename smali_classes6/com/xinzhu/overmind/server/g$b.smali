.class public final Lcom/xinzhu/overmind/server/g$b;
.super Ljava/lang/Object;
.source "MindSystemConfig.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xinzhu/overmind/server/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:[Ljava/lang/String;

.field public final d:Z


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/xinzhu/overmind/server/g$b;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Z)V

    return-void
.end method

.method constructor <init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Z)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/xinzhu/overmind/server/g$b;->a:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/xinzhu/overmind/server/g$b;->b:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/xinzhu/overmind/server/g$b;->c:[Ljava/lang/String;

    .line 6
    iput-boolean p4, p0, Lcom/xinzhu/overmind/server/g$b;->d:Z

    return-void
.end method
