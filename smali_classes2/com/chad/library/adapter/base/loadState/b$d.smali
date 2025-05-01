.class public final Lcom/chad/library/adapter/base/loadState/b$d;
.super Lcom/chad/library/adapter/base/loadState/b;
.source "LoadState.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/chad/library/adapter/base/loadState/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/chad/library/adapter/base/loadState/b$d$a;
    }
.end annotation


# static fields
.field public static final b:Lcom/chad/library/adapter/base/loadState/b$d$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final c:Lcom/chad/library/adapter/base/loadState/b$d;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final d:Lcom/chad/library/adapter/base/loadState/b$d;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/chad/library/adapter/base/loadState/b$d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/chad/library/adapter/base/loadState/b$d$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/chad/library/adapter/base/loadState/b$d;->b:Lcom/chad/library/adapter/base/loadState/b$d$a;

    .line 1
    new-instance v0, Lcom/chad/library/adapter/base/loadState/b$d;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/chad/library/adapter/base/loadState/b$d;-><init>(Z)V

    sput-object v0, Lcom/chad/library/adapter/base/loadState/b$d;->c:Lcom/chad/library/adapter/base/loadState/b$d;

    .line 2
    new-instance v0, Lcom/chad/library/adapter/base/loadState/b$d;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/chad/library/adapter/base/loadState/b$d;-><init>(Z)V

    sput-object v0, Lcom/chad/library/adapter/base/loadState/b$d;->d:Lcom/chad/library/adapter/base/loadState/b$d;

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/chad/library/adapter/base/loadState/b;-><init>(ZLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public static final synthetic b()Lcom/chad/library/adapter/base/loadState/b$d;
    .locals 1

    .line 1
    sget-object v0, Lcom/chad/library/adapter/base/loadState/b$d;->c:Lcom/chad/library/adapter/base/loadState/b$d;

    return-object v0
.end method

.method public static final synthetic c()Lcom/chad/library/adapter/base/loadState/b$d;
    .locals 1

    .line 1
    sget-object v0, Lcom/chad/library/adapter/base/loadState/b$d;->d:Lcom/chad/library/adapter/base/loadState/b$d;

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    instance-of v0, p1, Lcom/chad/library/adapter/base/loadState/b$d;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/chad/library/adapter/base/loadState/b;->a()Z

    move-result v0

    check-cast p1, Lcom/chad/library/adapter/base/loadState/b$d;

    invoke-virtual {p1}, Lcom/chad/library/adapter/base/loadState/b;->a()Z

    move-result p1

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public hashCode()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/chad/library/adapter/base/loadState/b;->a()Z

    move-result v0

    invoke-static {v0}, Lcom/chad/library/adapter/base/loadState/a;->a(Z)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "NotLoading(endOfPaginationReached="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/chad/library/adapter/base/loadState/b;->a()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
