.class public abstract Lcom/chad/library/adapter/base/loadState/b;
.super Ljava/lang/Object;
.source "LoadState.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/chad/library/adapter/base/loadState/b$a;,
        Lcom/chad/library/adapter/base/loadState/b$b;,
        Lcom/chad/library/adapter/base/loadState/b$c;,
        Lcom/chad/library/adapter/base/loadState/b$d;
    }
.end annotation


# instance fields
.field private final a:Z


# direct methods
.method private constructor <init>(Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-boolean p1, p0, Lcom/chad/library/adapter/base/loadState/b;->a:Z

    return-void
.end method

.method public synthetic constructor <init>(ZLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/chad/library/adapter/base/loadState/b;-><init>(Z)V

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/chad/library/adapter/base/loadState/b;->a:Z

    return v0
.end method
