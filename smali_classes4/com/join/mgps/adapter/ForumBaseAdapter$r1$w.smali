.class public Lcom/join/mgps/adapter/ForumBaseAdapter$r1$w;
.super Ljava/lang/Object;
.source "ForumBaseAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/adapter/ForumBaseAdapter$r1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "w"
.end annotation


# instance fields
.field public a:Z

.field public b:Ljava/lang/String;

.field public c:Lcom/join/mgps/dto/ForumBean$GameInfo;

.field public d:Ljava/lang/String;


# direct methods
.method public constructor <init>(ZLjava/lang/String;Lcom/join/mgps/dto/ForumBean$GameInfo;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-boolean p1, p0, Lcom/join/mgps/adapter/ForumBaseAdapter$r1$w;->a:Z

    .line 3
    iput-object p2, p0, Lcom/join/mgps/adapter/ForumBaseAdapter$r1$w;->b:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lcom/join/mgps/adapter/ForumBaseAdapter$r1$w;->c:Lcom/join/mgps/dto/ForumBean$GameInfo;

    .line 5
    iput-object p4, p0, Lcom/join/mgps/adapter/ForumBaseAdapter$r1$w;->d:Ljava/lang/String;

    return-void
.end method
