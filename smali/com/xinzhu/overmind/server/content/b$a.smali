.class public final Lcom/xinzhu/overmind/server/content/b$a;
.super Ljava/lang/Object;
.source "MindContentService.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xinzhu/overmind/server/content/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field final a:Lcom/xinzhu/overmind/server/content/b$b;

.field final b:Landroid/database/IContentObserver;

.field final c:Z


# direct methods
.method constructor <init>(Lcom/xinzhu/overmind/server/content/b$b;Landroid/database/IContentObserver;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/xinzhu/overmind/server/content/b$a;->a:Lcom/xinzhu/overmind/server/content/b$b;

    .line 3
    iput-object p2, p0, Lcom/xinzhu/overmind/server/content/b$a;->b:Landroid/database/IContentObserver;

    .line 4
    iput-boolean p3, p0, Lcom/xinzhu/overmind/server/content/b$a;->c:Z

    return-void
.end method
