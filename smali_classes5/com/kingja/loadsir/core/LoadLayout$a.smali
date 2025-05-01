.class Lcom/kingja/loadsir/core/LoadLayout$a;
.super Ljava/lang/Object;
.source "LoadLayout.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kingja/loadsir/core/LoadLayout;->d(Ljava/lang/Class;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/lang/Class;

.field final synthetic c:Lcom/kingja/loadsir/core/LoadLayout;


# direct methods
.method constructor <init>(Lcom/kingja/loadsir/core/LoadLayout;Ljava/lang/Class;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kingja/loadsir/core/LoadLayout$a;->c:Lcom/kingja/loadsir/core/LoadLayout;

    iput-object p2, p0, Lcom/kingja/loadsir/core/LoadLayout$a;->b:Ljava/lang/Class;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kingja/loadsir/core/LoadLayout$a;->c:Lcom/kingja/loadsir/core/LoadLayout;

    iget-object v1, p0, Lcom/kingja/loadsir/core/LoadLayout$a;->b:Ljava/lang/Class;

    invoke-static {v0, v1}, Lcom/kingja/loadsir/core/LoadLayout;->a(Lcom/kingja/loadsir/core/LoadLayout;Ljava/lang/Class;)V

    return-void
.end method
