.class public Lcom/xinzhu/overmind/utils/helpers/l;
.super Ljava/lang/Object;
.source "StartActivityHelper.java"


# static fields
.field private static a:I

.field private static b:I

.field private static c:I

.field private static d:I

.field private static e:I

.field private static f:I

.field private static g:I

.field private static h:I

.field private static i:I

.field private static j:I

.field private static k:I

.field private static l:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/xinzhu/overmind/utils/e;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    sget v0, Lcom/xinzhu/overmind/utils/helpers/l;->a:I

    add-int/lit8 v1, v0, 0x1

    sput v1, Lcom/xinzhu/overmind/utils/helpers/l;->a:I

    sput v0, Lcom/xinzhu/overmind/utils/helpers/l;->b:I

    add-int/lit8 v0, v1, 0x1

    .line 3
    sput v0, Lcom/xinzhu/overmind/utils/helpers/l;->a:I

    sput v1, Lcom/xinzhu/overmind/utils/helpers/l;->c:I

    add-int/lit8 v1, v0, 0x1

    .line 4
    sput v1, Lcom/xinzhu/overmind/utils/helpers/l;->a:I

    sput v0, Lcom/xinzhu/overmind/utils/helpers/l;->d:I

    add-int/lit8 v0, v1, 0x1

    .line 5
    sput v0, Lcom/xinzhu/overmind/utils/helpers/l;->a:I

    sput v1, Lcom/xinzhu/overmind/utils/helpers/l;->e:I

    add-int/lit8 v1, v0, 0x1

    .line 6
    sput v1, Lcom/xinzhu/overmind/utils/helpers/l;->a:I

    sput v0, Lcom/xinzhu/overmind/utils/helpers/l;->f:I

    add-int/lit8 v0, v1, 0x1

    .line 7
    sput v0, Lcom/xinzhu/overmind/utils/helpers/l;->a:I

    sput v1, Lcom/xinzhu/overmind/utils/helpers/l;->g:I

    add-int/lit8 v1, v0, 0x1

    .line 8
    sput v1, Lcom/xinzhu/overmind/utils/helpers/l;->a:I

    sput v0, Lcom/xinzhu/overmind/utils/helpers/l;->h:I

    add-int/lit8 v0, v1, 0x1

    .line 9
    sput v0, Lcom/xinzhu/overmind/utils/helpers/l;->a:I

    sput v1, Lcom/xinzhu/overmind/utils/helpers/l;->i:I

    add-int/lit8 v1, v0, 0x1

    .line 10
    sput v1, Lcom/xinzhu/overmind/utils/helpers/l;->a:I

    sput v0, Lcom/xinzhu/overmind/utils/helpers/l;->j:I

    add-int/lit8 v0, v1, 0x1

    .line 11
    sput v0, Lcom/xinzhu/overmind/utils/helpers/l;->a:I

    sput v1, Lcom/xinzhu/overmind/utils/helpers/l;->k:I

    add-int/lit8 v1, v0, 0x1

    .line 12
    sput v1, Lcom/xinzhu/overmind/utils/helpers/l;->a:I

    sput v0, Lcom/xinzhu/overmind/utils/helpers/l;->l:I

    goto :goto_0

    .line 13
    :cond_0
    sget v0, Lcom/xinzhu/overmind/utils/helpers/l;->a:I

    add-int/lit8 v1, v0, 0x1

    sput v1, Lcom/xinzhu/overmind/utils/helpers/l;->a:I

    sput v0, Lcom/xinzhu/overmind/utils/helpers/l;->b:I

    add-int/lit8 v0, v1, 0x1

    .line 14
    sput v0, Lcom/xinzhu/overmind/utils/helpers/l;->a:I

    sput v1, Lcom/xinzhu/overmind/utils/helpers/l;->c:I

    add-int/lit8 v1, v0, 0x1

    .line 15
    sput v1, Lcom/xinzhu/overmind/utils/helpers/l;->a:I

    sput v0, Lcom/xinzhu/overmind/utils/helpers/l;->e:I

    add-int/lit8 v0, v1, 0x1

    .line 16
    sput v0, Lcom/xinzhu/overmind/utils/helpers/l;->a:I

    sput v1, Lcom/xinzhu/overmind/utils/helpers/l;->f:I

    add-int/lit8 v1, v0, 0x1

    .line 17
    sput v1, Lcom/xinzhu/overmind/utils/helpers/l;->a:I

    sput v0, Lcom/xinzhu/overmind/utils/helpers/l;->g:I

    add-int/lit8 v0, v1, 0x1

    .line 18
    sput v0, Lcom/xinzhu/overmind/utils/helpers/l;->a:I

    sput v1, Lcom/xinzhu/overmind/utils/helpers/l;->h:I

    add-int/lit8 v1, v0, 0x1

    .line 19
    sput v1, Lcom/xinzhu/overmind/utils/helpers/l;->a:I

    sput v0, Lcom/xinzhu/overmind/utils/helpers/l;->i:I

    add-int/lit8 v0, v1, 0x1

    .line 20
    sput v0, Lcom/xinzhu/overmind/utils/helpers/l;->a:I

    sput v1, Lcom/xinzhu/overmind/utils/helpers/l;->j:I

    add-int/lit8 v1, v0, 0x1

    .line 21
    sput v1, Lcom/xinzhu/overmind/utils/helpers/l;->a:I

    sput v0, Lcom/xinzhu/overmind/utils/helpers/l;->k:I

    add-int/lit8 v0, v1, 0x1

    .line 22
    sput v0, Lcom/xinzhu/overmind/utils/helpers/l;->a:I

    sput v1, Lcom/xinzhu/overmind/utils/helpers/l;->l:I

    :goto_0
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static A(I)V
    .locals 0

    .line 1
    sput p0, Lcom/xinzhu/overmind/utils/helpers/l;->i:I

    return-void
.end method

.method public static B(I)V
    .locals 0

    .line 1
    sput p0, Lcom/xinzhu/overmind/utils/helpers/l;->f:I

    return-void
.end method

.method public static C(I)V
    .locals 0

    .line 1
    sput p0, Lcom/xinzhu/overmind/utils/helpers/l;->g:I

    return-void
.end method

.method public static D(I)V
    .locals 0

    .line 1
    sput p0, Lcom/xinzhu/overmind/utils/helpers/l;->h:I

    return-void
.end method

.method public static a()I
    .locals 1

    .line 1
    sget v0, Lcom/xinzhu/overmind/utils/helpers/l;->b:I

    return v0
.end method

.method public static b([Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    if-eqz p0, :cond_1

    .line 1
    array-length v0, p0

    sget v1, Lcom/xinzhu/overmind/utils/helpers/l;->c:I

    if-ge v0, v1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    aget-object p0, p0, v1

    check-cast p0, Ljava/lang/String;

    return-object p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static c()I
    .locals 1

    .line 1
    sget v0, Lcom/xinzhu/overmind/utils/helpers/l;->c:I

    return v0
.end method

.method public static d([Ljava/lang/Object;)I
    .locals 2

    if-eqz p0, :cond_1

    .line 1
    array-length v0, p0

    sget v1, Lcom/xinzhu/overmind/utils/helpers/l;->j:I

    if-ge v0, v1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    aget-object p0, p0, v1

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0

    :cond_1
    :goto_0
    const/4 p0, -0x1

    return p0
.end method

.method public static e()I
    .locals 1

    .line 1
    sget v0, Lcom/xinzhu/overmind/utils/helpers/l;->j:I

    return v0
.end method

.method public static f([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    if-eqz p0, :cond_1

    .line 1
    array-length v0, p0

    sget v1, Lcom/xinzhu/overmind/utils/helpers/l;->b:I

    if-ge v0, v1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    aget-object p0, p0, v1

    return-object p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static g([Ljava/lang/Object;)Landroid/content/Intent;
    .locals 2

    if-eqz p0, :cond_1

    .line 1
    array-length v0, p0

    sget v1, Lcom/xinzhu/overmind/utils/helpers/l;->e:I

    if-ge v0, v1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    aget-object p0, p0, v1

    check-cast p0, Landroid/content/Intent;

    return-object p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static h()I
    .locals 1

    .line 1
    sget v0, Lcom/xinzhu/overmind/utils/helpers/l;->e:I

    return v0
.end method

.method public static i([Ljava/lang/Object;)Landroid/os/Bundle;
    .locals 2

    if-eqz p0, :cond_1

    .line 1
    array-length v0, p0

    sget v1, Lcom/xinzhu/overmind/utils/helpers/l;->l:I

    if-ge v0, v1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    aget-object p0, p0, v1

    check-cast p0, Landroid/os/Bundle;

    return-object p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static j()I
    .locals 1

    .line 1
    sget v0, Lcom/xinzhu/overmind/utils/helpers/l;->l:I

    return v0
.end method

.method public static k([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    if-eqz p0, :cond_1

    .line 1
    array-length v0, p0

    sget v1, Lcom/xinzhu/overmind/utils/helpers/l;->k:I

    if-ge v0, v1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    aget-object p0, p0, v1

    return-object p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static l()I
    .locals 1

    .line 1
    sget v0, Lcom/xinzhu/overmind/utils/helpers/l;->k:I

    return v0
.end method

.method public static m([Ljava/lang/Object;)I
    .locals 2

    if-eqz p0, :cond_1

    .line 1
    array-length v0, p0

    sget v1, Lcom/xinzhu/overmind/utils/helpers/l;->i:I

    if-ge v0, v1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    aget-object p0, p0, v1

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0

    :cond_1
    :goto_0
    const/4 p0, -0x1

    return p0
.end method

.method public static n()I
    .locals 1

    .line 1
    sget v0, Lcom/xinzhu/overmind/utils/helpers/l;->i:I

    return v0
.end method

.method public static o([Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    if-eqz p0, :cond_1

    .line 1
    array-length v0, p0

    sget v1, Lcom/xinzhu/overmind/utils/helpers/l;->f:I

    if-ge v0, v1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    aget-object p0, p0, v1

    check-cast p0, Ljava/lang/String;

    return-object p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static p()I
    .locals 1

    .line 1
    sget v0, Lcom/xinzhu/overmind/utils/helpers/l;->f:I

    return v0
.end method

.method public static q([Ljava/lang/Object;)Landroid/os/IBinder;
    .locals 2

    if-eqz p0, :cond_1

    .line 1
    array-length v0, p0

    sget v1, Lcom/xinzhu/overmind/utils/helpers/l;->g:I

    if-ge v0, v1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    aget-object p0, p0, v1

    check-cast p0, Landroid/os/IBinder;

    return-object p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static r()I
    .locals 1

    .line 1
    sget v0, Lcom/xinzhu/overmind/utils/helpers/l;->g:I

    return v0
.end method

.method public static s([Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    if-eqz p0, :cond_1

    .line 1
    array-length v0, p0

    sget v1, Lcom/xinzhu/overmind/utils/helpers/l;->h:I

    if-ge v0, v1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    aget-object p0, p0, v1

    check-cast p0, Ljava/lang/String;

    return-object p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static t()I
    .locals 1

    .line 1
    sget v0, Lcom/xinzhu/overmind/utils/helpers/l;->h:I

    return v0
.end method

.method public static u(I)V
    .locals 0

    .line 1
    sput p0, Lcom/xinzhu/overmind/utils/helpers/l;->b:I

    return-void
.end method

.method public static v(I)V
    .locals 0

    .line 1
    sput p0, Lcom/xinzhu/overmind/utils/helpers/l;->c:I

    return-void
.end method

.method public static w(I)V
    .locals 0

    .line 1
    sput p0, Lcom/xinzhu/overmind/utils/helpers/l;->j:I

    return-void
.end method

.method public static x(I)V
    .locals 0

    .line 1
    sput p0, Lcom/xinzhu/overmind/utils/helpers/l;->e:I

    return-void
.end method

.method public static y(I)V
    .locals 0

    .line 1
    sput p0, Lcom/xinzhu/overmind/utils/helpers/l;->l:I

    return-void
.end method

.method public static z(I)V
    .locals 0

    .line 1
    sput p0, Lcom/xinzhu/overmind/utils/helpers/l;->k:I

    return-void
.end method
